import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String kigou = sc.next();
            switch (kigou) {
                case "+": {
                    int a = arrayDeque.pop();
                    int b = arrayDeque.pop();
                    arrayDeque.push(a + b);
                    break;
                }
                case "-": {
                    int a = arrayDeque.pop();
                    int b = arrayDeque.pop();
                    arrayDeque.push(b - a);
                    break;
                }
                case "*": {
                    int a = arrayDeque.pop();
                    int b = arrayDeque.pop();
                    arrayDeque.push(a * b);
                    break;
                }
                default:
                    arrayDeque.push(Integer.parseInt(kigou));
                    break;
            }
        }

        System.out.println(arrayDeque.pop());

    }

}
