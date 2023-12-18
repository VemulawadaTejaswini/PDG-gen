import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] T=new int[n];
        int[] A=new int[n];
        for (int i = 0; i < n; i++) {
            T[i]=sc.nextInt();
            A[i]=sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            long t=T[i],a=A[i];
            while (T[i-1]>T[i]||A[i-1]>A[i]){
                T[i]+=t;
                A[i]+=a;
            }
        }
        out.println(T[n-1]+A[n-1]);
    }
}