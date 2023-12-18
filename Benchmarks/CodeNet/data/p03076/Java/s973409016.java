import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int min = 129;
        int idx = 5;
        for(int i=0; i<5; i++) {
            a[i] = Integer.parseInt(sc.next());
            if((a[i] % 10) != 0 && (min % 10) > (a[i] % 10)) {
                min = a[i];
                idx = i;
            }else if((a[i] % 10) != 0 && min > a[i] && (min % 10) >= (a[i] % 10)) {
                min = a[i];
                idx = i;
            }
            
        }
        int sum = 0;
        for(int i=0; i<5; i++) {
            if(i == idx) {
                sum += a[i];
            }else {
                if(a[i] % 10 == 0) {
                    sum += a[i];
                }else {
                    sum += a[i];
                    sum += 10 - a[i] % 10;
                }
            }
        }
        System.out.println(sum);
    }
}