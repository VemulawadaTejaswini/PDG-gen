import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,ans=0;
        
        n = sc.nextInt();
        
        ArrayList<String> array = new ArrayList<String>();
        
        for(int i = 0; i < n; i++){
            
            String prize;
            prize = sc.next();
            
            if(array.indexOf(prize) == -1){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
