
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static class LinkElement {
        LinkElement prev;
        LinkElement next;
        Object value;
        
        public LinkElement(Object value) {
            this.value = value;
        }

        public void insertAfter(LinkElement newElement) {
            newElement.prev = this;
            newElement.next = this.next;
            this.next.prev = newElement;
            this.next = newElement;
        }
/*        
        public void insertBefore(LinkElement newElement) {
            newElement.prev = this.prev;
            newElement.next = this;
            this.prev = newElement;
        }
*/
        public void delete() {
            if (prev != null) {
                prev.next = next;
            }
            if (next != null) {
                next.prev = prev;
            }
        }
    }

    static class DoubleLinkedList {
        LinkElement first;
        LinkElement last;

        public DoubleLinkedList() {
            first = new LinkElement(null);
            last = new LinkElement(null);
            first.next = last;
            last.prev = first;
        }

        public void insert(Object x) {
            first.insertAfter(new LinkElement(x));
        }
        
        public void delete(Object x) {
            LinkElement it = first.next;
            while (it != last) {
                if (it.value.equals(x)) {
                    it.delete();
                    break;
                }
                it = it.next;
            }
        }
        
        public void deleteFirst() {
            if (first.next != last) {
                first.next.delete();
            }
        }
        
        public void deleteLast() {
            if (first.next != last) {
                last.prev.delete();
            }
        }
        
        public String toString() {
            StringBuilder builder = new StringBuilder();
            LinkElement it = first.next;
            while (it != last) {
                if (builder.length() > 0) {
                    builder.append(" ");
                }
                builder.append(it.value);
                it = it.next;
            }
            return builder.toString();
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        DoubleLinkedList list = new DoubleLinkedList();
        
        for (int i = 0;i < n;i++) {
            String[] elems = r.readLine().split(" ");
            String cmd = elems[0];
            if (cmd.equals("insert")) {
                list.insert(Integer.parseInt(elems[1]));
            } else if (cmd.equals("delete")) {
                list.delete(Integer.parseInt(elems[1]));
            } else if (cmd.equals("deleteFirst")) {
                list.deleteFirst();
            } else if (cmd.equals("deleteLast")) {
                list.deleteLast();
            } else {
                break;
            }
        }
        
        System.out.println(list.toString());
    }
}