import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ceter = s.length/2;
        int ans = 0;

        for(int i = 0;i < center;i++){
            if(s[i] != s[s.length-1-1])
                ans++;
        }

        System.out.println(ans);
    }
}