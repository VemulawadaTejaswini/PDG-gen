import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        char[] div = s.toCharArray();
        long ans = 0;
        
        if(s.charAt(0) == s.charAt(s.length()-1)){
            ans = 1;
            div[s.length()-1] = '0';
        }
        for(int i = 1;i < s.length()-1;i += 2){
            if(div[i-1] == div[i] && div[i] == div[i+1]){
                div[i-1] = '1';
                div[i+1] = '2';
                ans +=2;
            }else if(div[i-1] == div[i]){
                div[i+1] = '3';
                ans++;
            }else if(div[i] == div[i+1]){
                div[i+1] = '4';
                ans++;
            }
        }
        if(s.length()%2 == 0){
            if(div[s.length()-1] == div[s.length()-2]){
                ans++;
            }
        }
        ans *= k;

        System.out.println(ans);
    }
}
