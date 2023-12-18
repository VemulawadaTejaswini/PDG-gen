import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); int k = sc.nextInt();
        if (k >= (1 << m) || k != 0) {
            System.out.println(-1);
        } else {
            LinkedList<Integer> ans = new LinkedList<>();
            ans.addFirst(k); ans.addLast(k);
            for (int i = 0; i < (1 << m); i++) {
                if (i != k) {
                    ans.addFirst(i); ans.addLast(i);
                }
            }
            int temp = ans.size();
            for (int i = 0; i < temp; i++) System.out.print(ans.pollFirst() + " ");
        }
    }


}