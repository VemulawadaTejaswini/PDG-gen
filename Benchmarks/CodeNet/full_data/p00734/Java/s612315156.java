import java.util.Scanner;
 
 
public class Main {
 
    public static void main(String[] args) {
         
        Scanner scanner =new Scanner(System.in);
        while(true) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
         
            if((n+m)==0) break;
         
            int[] t =new int[1000];
            int[] h =new int[1000];
         
            int sum_t =0;
            int sum_h =0;
         
            for(int i=0; i<n; i++){
                t[i]=scanner.nextInt();
                sum_t += t[i];
            }
            for(int j=0; j<m; j++){
                h[j]=scanner.nextInt();
                sum_h +=h[j];
            }
         
            int ct=10000000;
            int ch=10000000;
         
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(sum_t-t[i]+h[j] == sum_h-h[j]+t[i]){
                        if(t[i]+h[j]<ct+ch){
                        ct=t[i];
                        ch=h[i];
                        }
                    }
                }
            }
            System.out.println(ct+" "+ch);
        }
    }
}