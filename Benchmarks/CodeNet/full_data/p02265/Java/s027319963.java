import java.lang.StringBuilder;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static class Data {
        private int key;
        private Data next;
        private Data prev;
    
        public Data(int key) {
            this.key = key;
            this.next = null;
            this.prev = null;
        }
        
        public void setNext(Data data) {
            this.next = data;
        }
        
        public void setPrev(Data data) {
            this.prev = data;
        }
    
        public boolean unmatch(int key) {
            if(this.key != key) {
                return true;
            }
            return false;
        }
        
        public int getKey() {
            return this.key;
        }
    
        public Data getNext() {
            return this.next;
        }
    
        public Data getPrev() {
            return this.prev;
        }
    }

    private static class DoublyLinkedList {
        private Data dummy;
        private Data last;
        
        public DoublyLinkedList() {
            this.dummy = new Data(-1);
            this.dummy.setNext(this.dummy);
            this.dummy.setPrev(this.dummy);
            this.last = this.dummy;
        }
        
        public void print() {
            Data data = this.dummy.getNext();
            StringBuilder sb = new StringBuilder();
            sb.append(data.key);

            data = data.getNext();
            while(data.getKey() != this.dummy.getKey()) {
                sb.append(" ");
                sb.append(data.key);
                data = data.getNext();
            }
            System.out.println(sb.toString());
        }
        
        public void insert(int key) {
            Data data = new Data(key);
            data.setNext(this.dummy.getNext());
            data.setPrev(this.dummy);
            data.getNext().setPrev(data);
            this.dummy.setNext(data);
        }
        
        public void delete(int key) {
            Data data = this.dummy.getNext();
            while(data.getKey() != this.dummy.getKey()) {
                if(data.unmatch(key)) {
                    data = data.getNext();
                    continue;
                }
                
                Data prev = data.getPrev();
                Data next = data.getNext();
                prev.setNext(next);
                next.setPrev(prev);
                data = data.getNext();
                break;
            }
        }
        
        public void deleteFirst() {
            Data newFirst = this.dummy.getNext().getNext();
            this.dummy.setNext(newFirst);
            newFirst.setPrev(this.dummy);
        }

        public void deleteLast() {
            Data newLast = this.last.getPrev().getPrev();
            this.last.setPrev(newLast);
            newLast.setNext(this.last);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        HashMap<String, Integer> commandMap = new HashMap<String, Integer>();
        commandMap.put("insert", 0);
        commandMap.put("delete", 1);
        commandMap.put("deleteFirst", 2);
        commandMap.put("deleteLast", 3);

        for(int i = 0; i < n; i++) {
            String command = sc.next();

            if(commandMap.get(command) == 0) {
                int x = sc.nextInt();
                list.insert(x);

            } else if(commandMap.get(command) == 2) {
                list.deleteFirst();

            } else if(commandMap.get(command) == 3) {
                list.deleteLast();

            } else {
                int x = sc.nextInt();
                list.delete(x);
            }
        }
        
        list.print();
    }
}