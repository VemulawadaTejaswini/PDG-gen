import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    private static class Data {
        public int key;
        public Data next;
        public Data prev;
    
        public Data(int key) {
            this.key = key;
            this.next = null;
            this.prev = null;
        }
    }

    private static class DoublyLinkedList {
        private Data dummy;
        private Data last;
        
        public DoublyLinkedList() {
            this.dummy = new Data(-1);
            this.dummy.next = this.dummy;
            this.dummy.prev = this.dummy;
            this.last = this.dummy;
        }
        
        public void print() {
            Data data = this.dummy.next;
            StringBuilder sb = new StringBuilder();
            sb.append(data.key);

            data = data.next;
            while(data.key!= this.dummy.key) {
                sb.append(" ");
                sb.append(data.key);
                data = data.next;
            }
            System.out.println(sb.toString());
        }
        
        public void insert(int key) {
            Data data = new Data(key);
            data.next = this.dummy.next;
            data.prev = this.dummy;
            data.next.prev = data;
            this.dummy.next = data;
        }
        
        public void delete(int key) {
            for(Data data = this.dummy.next; data.key != this.dummy.key; data = data.next) {
                if(data.key == key) {
                    data.prev.next = data.next;
                    data.next.prev = data.prev;
                    break;
                }
            }
        }
        
        public void deleteFirst() {
            Data newFirst = this.dummy.next.next;
            this.dummy.next = newFirst;
            newFirst.prev = this.dummy;
        }

        public void deleteLast() {
            Data newLast = this.last.prev.prev;
            this.last.prev = newLast;
            newLast.next = this.last;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        
        for(int i = 0; i < n; i++) {
            String command = sc.next();

            if(command.equals("insert")) {
                int x = sc.nextInt();
                list.insert(x);

            } else if(command.equals("delete")) {
                int x = sc.nextInt();
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