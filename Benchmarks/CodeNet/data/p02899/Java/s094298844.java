import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < n; j++){
                if(a[j] == i) System.out.print(j + 1 + " ");
            }
        }
    }
}