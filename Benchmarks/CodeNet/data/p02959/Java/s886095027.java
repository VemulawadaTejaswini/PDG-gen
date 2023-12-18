
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[n];
        int c = 0; //倒した数
        
        for(int i = 0; i < n + 1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            
            if(a[i] >= b[i]){
                c += b[i];
            }else{
                c += a[i];
                if(a[i + 1] >= (b[i] - a[i])){
                    c += b[i] - a[i];
                    a[i + 1] -= b[i] - a[i];
                }else{
                    c += a[i + 1];
                    a[i + 1] = 0;
                }
                
            }
        }
     System.out.println(c);
        
    }
}
