import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);     
       int N = scan.nextInt();
       int M = scan.nextInt();
       int[] a = new int[N];
       int count = 0;
       for(int i = 0;i<N;i++){
           a[i] = scan.nextInt();
       }
       
       int small = a[0];
       for(int i = 0;i<N;i++){
           if(small>a[i])small = a[i];
       }
        
       for(int i = small;i<=M;i++){
           int c = 0;
           for(int j = 0;j<N;j++){             
               if((i*10/a[j])%5 == 0 && i%2 == 1){
                   c++;
               }
               if(c==N){
                   count++;
               }
           }
       }
       System.out.println(count);
    }  
}
