import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        
        if(m<=d){
            ans = m;
        }else{
            ans = m-1;
        }
        
		System.out.println(ans);
    }
}
