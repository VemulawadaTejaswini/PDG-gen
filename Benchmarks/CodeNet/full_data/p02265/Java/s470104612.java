public class Main {
    static class Node {
        Node prev, next;
        int value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        nil.next = nil;
        nil.prev = nil;

        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int x = scan.nextInt();

            if (s.equals("delete")) {
                delete(x);
            } else if (s.equals("insert")) {
                insert(x);
            } else if (s.equals("deleteFirst")) {
                deleteFirst();
            } else if (s.equals("deleteLast")) {
                deleteLast();
            }

            }

        Node nn = nil.next;
        while (nn != nil) {
            System.out.print(nn.value + " ");
            nn = nn.next;
        }

    }

    static void insert(int x) {
        Node n = new Node();
        Node next = nil.next;

        nil.next = n;
        n.next = next;
        n.prev = nil;
        next.prev = n;
        n.value = x;
    }

    static void delete(int x) {
        Node n = nil.next;
        while (n != nil && n.value != x) {
            n = n.next;
        }
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    static void deleteFirst() {
        Node next = nil.next.next;
        nil.next = next;
        next.prev = nil;
    }

    static void deleteLast() {
        Node n = nil;
        while (n.next != nil && n != nil) {
            n = n.next;
        }
        Node prev = n.prev;
        prev.next = nil;
        nil.prev = prev;
    }

    static Node nil = new Node();

}

