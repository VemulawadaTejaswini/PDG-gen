import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        StringBuffer buff = new StringBuffer();
        String a[] = new String[N];
        for(int i = 0;i < a.length;i++){
            a[i] = sc.next();
        }
        Arrays.sort(a);
        for(int i = 0;i < N;i++){
            buff.append(a[i]);
        }
        System.out.println(buff);
    }
}
