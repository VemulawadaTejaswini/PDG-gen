import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        int k=sc.nextInt();
        double ans=0;
        int count;
        int tmp;
        for(int i=1;i<=n;i++){
            count=0;
            tmp=i;
            while(tmp<k){
                tmp*=2;
                count++;
            }
            
            ans+=Math.pow(2, -count)/n;
        }
        System.out.println(ans);
 
    }

}