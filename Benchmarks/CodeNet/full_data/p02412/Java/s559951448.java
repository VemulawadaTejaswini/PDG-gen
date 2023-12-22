import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n=0, sum=0;
        int othe = 0;
        int count=0;
        
        while(true){
            n = Integer.parseInt(sc.next());
            sum = Integer.parseInt(sc.next());
            if(n==0) break;
            
            count=0;
            for(int i=1; i<n; i++){
                for(int j=i+1; j<n; j++){
                    othe=(sum-i-j);
                    if((othe > j) && (othe <= n)) count++;
                }
            }
            System.out.println(count);
        }
    }
}
