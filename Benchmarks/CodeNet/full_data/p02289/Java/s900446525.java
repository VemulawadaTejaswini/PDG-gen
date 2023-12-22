import java.util.LinkedList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        LinkedList<Long> set = new LinkedList<>();
        while (!n.equals("end")){
            if(n.equals("insert")){
                int x = scan.nextInt();
                if(set.isEmpty()){
                    set.add((long)x);
                }
                else if(x > set.peekFirst()){
                    set.addFirst((long)x);
                }
                else{
                    set.addLast((long)x);
                }
            }
            else{
                System.out.println(set.removeFirst());
            }
            n = scan.next();
        }
    }
}
