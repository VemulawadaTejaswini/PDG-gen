import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        boolean ok = true;
        for(int i = 0; i < n ; i++){
            h[i] = scan.nextInt();
        }
        if(n == 1){
        	System.out.print("Yes");
        }
     	else{
        for(int j = n-1; j > 0; j--){
            if(h[j-1] == h[j] + 1){
                h[j-1] = h[j-1] - 1;
            }
            else if (h[j-1] > h[j] + 1){
                ok = false;
            }
        }
        System.out.print((ok ? "Yes" : "No"));
        }
        scan.close();
    }
}