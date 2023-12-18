
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i=0;i<N;i++){
            int tmp = sc.nextInt();
            a[i] = tmp;
            b[i] = tmp;
        }
        Arrays.sort(a);
        int max1 = a[N-1];
        int max2 = a[N-2];
        for(int i=0;i<N;i++){
            if(b[i] == max1){
                System.out.println(max2);
            }
            else{
                System.out.println(max1);
            }
        }
    }
}