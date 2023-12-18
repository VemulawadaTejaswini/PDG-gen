import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,m,sum = 0,count = 0;
        String ans = "No";
        ArrayList<Integer> a = new ArrayList<Integer>();
        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
            sum += a.get(i);
        }
        
        for(int i = 0; i < n; i++){
            if(a.get(i) >= (sum / (4 * m))){
                count++;
            }
        }
        
        if(count >= m){
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}
