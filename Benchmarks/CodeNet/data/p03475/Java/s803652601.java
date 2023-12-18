import java.util.*;
 
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n-1];
        int s[] = new int[n-1];
        int f[] = new int[n-1];
        for(int i=0; i<n-1; j++){
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            int t = 0;
            for(int j=i; J<n-1; j++){
                if(t<s[j]) t=s[j];
                else if(t%f[j] == 0) ;
                else t = t+f[j] - t%F[j];
                t+=c[j];
            }
            System.out.println(t);
        }
        
    }
}