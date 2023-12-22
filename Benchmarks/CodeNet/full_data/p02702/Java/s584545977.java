import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String S = sc.next();
        int N = S.length();
        
        for(int i = 0; i < N; i++){
            for(int h = i + 4; h < N + 1; h++){
            String s2 = S.substring(i, h);
            long s3 = Long.parseLong(s2);
            if(s3 % 2019 == 0){
                ans++;
            }
            }
            
            
        }
        System.out.print(ans);
        
    }
    
}