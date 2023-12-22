import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        try(Scanner scn = new Scanner(System.in)) {
            while(scn.hasNextInt()) {
                int num = scn.nextInt();
                if(num > 0) {
                    list.push(num);
                } else {
                    System.out.println(list.pop());
                }
            }
        }
    }
}