import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        long sum, min, max;
        sum = 0;
        max = -1000000;
        min = 1000000;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(max <= a[i]){
                max = a[i];
            }
            if(min >= a[i]){
                min = a[i];
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}