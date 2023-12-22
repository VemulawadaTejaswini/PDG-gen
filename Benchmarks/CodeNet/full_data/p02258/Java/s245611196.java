import java.util.Scanner;

public class Main{
   
    
    public static void main(String[] args){
        int n;
        int[] R;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        R = new int[n];
  
        for( int i = 0; i < n; i++) R[i] = sc.nextInt();
        
        int a = R[1] - R[0];
        int m = R[0];
        for ( int i = 1; i < n; i++){
            if (R[i] - m > a ) a = R[i] - m;
            if (R[i] < m ) m = R[i];
    }
    System.out.println(a);
  
    }
}