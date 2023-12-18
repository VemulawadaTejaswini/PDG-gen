import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        
        if(d==0){
            ans = n;
        }else if(d==1){
            ans = n*100
        }else if(d==2){
            ans = n*10000;
        }
        
		System.out.println(ans);
    }
}
