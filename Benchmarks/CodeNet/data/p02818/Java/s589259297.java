import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long kcookie = sc.nextLong();
            long acookie = sc.nextLong();
            long count = sc.nextLong();

            long ans1 = Math.max(0, kcookie - count);
            long ans2 = Math.max(0, Math.min(A+B-K,B));
            System.out.println(ans1 + " " + ans2);
            }
}