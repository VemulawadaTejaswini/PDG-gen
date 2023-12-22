import java.util.Scanner;
public class main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        int max = 0;
    
        for(int i = 0;i < S.length(); i++){        
        if(S.charAt(i)=='R'){
            ans++;
            if(ans > max){
                max = ans;
            }
        }else{
            ans = 0;
        }
        }
        System.out.println(max);
    }    
}
