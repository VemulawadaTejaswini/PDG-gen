import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            if(a[i] > max1) max1 = a[i];
        }
        for(int i = 0; i < n; i++){
            if(a[i] == max1){
                max2 = max1;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] == max1) System.out.println(max2);
            else System.out.println(max1);
        }
        scan.close();
    }
}