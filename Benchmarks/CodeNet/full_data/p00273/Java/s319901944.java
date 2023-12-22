import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(true){
            int m = sc.nextInt();
            if(m==0) break;
            int cnt = 0;
            boolean flag = false;
            for(int i=0;i<n;i++){
                int p = sc.nextInt();
                if(p>0) cnt++;
                if(p>1) flag = true;
            }
            if(!flag) System.out.println("NA");
            else System.out.println(cnt+1);
        }
    }
}