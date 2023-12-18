import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        if (s==Math.pow(10,9)){
            for (int i=0;i<k;i++)System.out.print(s+" ");
            for (int i=k;i<n-1;i++)System.out.print(1+" ");
            System.out.println(1);
        }else {
            for (int i=0;i<k;i++)System.out.print(s+" ");
            for (int i=k;i<n-1;i++)System.out.print((s+1)+" ");
            System.out.println(s+1);
        }
    }
}
