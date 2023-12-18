import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i = sc.nextInt();
        int o = sc.nextInt();
        int t = sc.nextInt();
        int j = sc.nextInt();
        int l = sc.nextInt();
        int s = sc.nextInt();
        int z = sc.nextInt();
        long ret = 0;
        ret += o;
        long temp = 0;
        if (i>0&&j>0&&l>0) {
            temp = Math.max(temp, (i-1)/2*2+(j-1)/2*2+(l-1)/2*2+3);
        }
        temp = Math.max(temp, i/2*2+j/2*2+l/2*2);
        ret += temp;
        
        System.out.println(ret);
    }
}
