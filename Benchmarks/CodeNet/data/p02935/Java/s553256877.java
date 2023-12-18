import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double[n];
        
        for(int  i = 0 ; i<n ; i++){
            
              a[i] = sc.nextDouble();
        }
          Arrays.sort(a);
        
         for (int j =0 ; j<n-1 ; j++){
             
                a[j+1]= (a[j] + a[j+1])/2 ;
         }
            
        System.out.println(a[n-1]);
    }
}
