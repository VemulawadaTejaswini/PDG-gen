import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        double border = sum/(4*m);
        Arrays.sort(a);
        int count = 0;
        for(int i = 1; i < n-1; i++){
            if(a[n-i] >= border){
                count++;
            } else {
                break;
            }
        }
        if(count >= m){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}