import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int HP1 = sc.nextInt();
        int AT1 = sc.nextInt();
        int HP2 = sc.nextInt();
        int AT2 = sc.nextInt();
        String ans = "Yes";
        
        while(true){
            HP2 = HP2 - AT1;
            if(HP2<=0){
                break;
            }
            HP1 = HP1 - AT2;
            if(HP1<=0){
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
    }
}
