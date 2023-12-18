import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        
        int ans = 0;
        
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                for(int k = 0; k <= c; k++){
                    if(i*500 + j*100 + k*50 ==x){
                        ans++;
                        break;
                    }else if(i*500 + j*100 + k*50 > x){
                        break;
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}
