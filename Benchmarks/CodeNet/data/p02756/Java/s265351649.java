import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        ReversableStack<Character> reversableStack = new ReversableStack<>();
        for (char c : s.toCharArray()) {
            reversableStack.addToEnd(c);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int t = scanner.nextInt();
            if(t==1){
                reversableStack.reverse();;
            }else{
                int f = scanner.nextInt();
                char c = scanner.nextLine().trim().charAt(0);
                if(f==1){
                    reversableStack.addToBeginnging(c);
                }else{
                    reversableStack.addToEnd(c);
                }
            }
        }
        int size = reversableStack.size();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(reversableStack.removeFromBeginning());
        }
        System.out.println(sb.toString());
    }

    public static class ReversableStack<T> {
        private boolean reversed = false;
        private final LinkedList<T> list = new LinkedList<>();

        public T getFromBeginning(){
            return reversed? list.getLast(): list.getFirst();
        }
        public T getFromEnd(){
            return reversed? list.getFirst(): list.getLast();
        }
        public T removeFromBeginning(){
            return reversed? list.removeLast(): list.removeFirst();
        }
        public T removeFromEnd(){
            return reversed? list.removeFirst(): list.removeLast();
        }
        public void addToBeginnging(T elem){
            if(reversed)
                list.addLast(elem);
            else
                list.addFirst(elem);
        }
        public void addToEnd(T elem){
            if(reversed)
                list.addFirst(elem);
            else
                list.addLast(elem);
        }

        public void reverse(){
            reversed = !reversed;
        }
        public int size(){
            return list.size();
        }
    }
}