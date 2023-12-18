import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        for(int i = n - 2; i >= 0; i--){
            if(h[i] <= h[i + 1]){
                
            }else if(h[i] - h[i + 1] == 1){
                h[i]--;
            }else if(h[i] != h[i + 1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        scan.close();
    }
}