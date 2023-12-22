import java.lang.StringBuilder;
import java.util.Scanner;
 
public class Main {
    private static class Data {
        private String key;
        private Data next;
        private Data prev;
     
        public Data(String key) {
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
     
        public boolean unmatch(String key) {
            if(this.key.equals(key)) {
                return false;
            }
            return true;
        }
     
        public Data getNext() {
            return this.next;
        }
     
        public Data getPrev() {
            return this.prev;
        }
    }
 
    private static class DoublyLinkedList {
        private Data first;
        private Data last;
         
        public DoublyLinkedList() {
            this.first = null;
            this.last = null;
        }
         
        public void print() {
            Data data = this.first;
            System.out.print(data.key);
 
            data = data.getNext();
            while(data != null) {
                System.out.print(" ");
                System.out.print(data.key);
                data = data.getNext();
            }
            System.out.println("");
        }
         
        public void insert(String key) {
            Data data = new Data(key);
            if(this.first == null) {
                this.first = data;
                this.last = data;
                return;
            }
             
            data.setNext(this.first);
            this.first.setPrev(data);
            this.first = data;
        }
         
        public void delete(String key) {
            Data data = this.first;
            while(data != null) {
                if(data.unmatch(key)) {
                    data = data.getNext();
                    continue;
                }
                
                Data prev = data.getPrev();
                Data next = data.getNext();
                 
                if(prev != null) {
                    prev.setNext(next);
                } else {
                    this.first = next;
                }
                 
                if(next != null) {
                    next.setPrev(prev);
                } else {
                    this.last = prev;
                }
 
                break;
            }
        }
         
        public void deleteFirst() {
            Data newFirst = this.first.getNext();
            if(newFirst == null) {
                this.first = null;
                this.last = null;
                return;
            }
             
            this.first.setNext(null);
            newFirst.setPrev(null);
            this.first = newFirst;
        }
 
        public void deleteLast() {
            Data newLast = this.last.getPrev();
            if(newLast == null) {
                this.first = null;
                this.last = null;
                return;
            }
             
            this.last.setPrev(null);
            newLast.setNext(null);
            this.last = newLast;
        }
    }
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
         
        for(int i = 0; i < n; i++) {
            String command = sc.next();
 
            if(command.equals("insert")) {
                String x = sc.next();
                list.insert(x);
 
            } else if(command.equals("delete")) {
                String x = sc.next();
                list.delete(x);
 
            } else if(command.equals("deleteFirst")) {
                list.deleteFirst();
 
            } else if(command.equals("deleteLast")) {
                list.deleteLast();
            }
        }
         
        list.print();
    }
}