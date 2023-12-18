import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[5];
        for(int i = 0 ; i < 5 ; i++){
            a[i] = sc.nextInt();
            if(i != 0){
                a[0] = Math.min(a[0] , a[i]);
            }
        }
        long yono = n / a[0];
        if(n % a[0] != 0) yono++;
        System.out.println(yono + 4);
    }
}