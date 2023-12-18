import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        
        if(d==0 && n!=100){
            ans = n;
        }else if(d==1 && n!=100){
            ans = n*100;
        }else{
            ans = n*10000;
        }
        
		System.out.println(ans);
    }
}
