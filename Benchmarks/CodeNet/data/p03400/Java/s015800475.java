import java.util.*;

public class B92 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int x=scn.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=(d-1)/scn.nextInt()+1;
        }
        System.out.println(sum+x);
    }
}
