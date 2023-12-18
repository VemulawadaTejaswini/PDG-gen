import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 0; i < n+1; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n+1; i++){
            sum = sum + a[i];
        }
        for(int i = 0; i < n; i++){
            if(b[i] >= (a[i] + a[i+1])){
                a[i] = 0;
                a[i+1] = 0;
            } else if(b[i] >= a[i] && b[i] <= (a[i] + a[i+1])){
                a[i+1] = a[i+1] - (b[i] - a[i]);
                a[i] = 0;
            } else {
                a[i] = a[i] - b[i];
            }
        }
        int sumd = 0;
        for(int i = 0; i < n+1; i++){
            sumd = sumd + a[i];
        }
        System.out.print(sum - sumd);
    }
}