import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int res1 = help(s,'(',')'), res2 = help(s,')','(');
        System.out.println(Math.max(res1,res2));
    }
    static int help(char[] s, char left, char right){
        int n = s.length;
        char[] dic = new char[n];
        for(int i=0;i<n;i++) dic[i]=s[i]=='0'?left:right;
        int ans = 0,cnt = 0;
        for(int i=0;i<n;i++){
            if(dic[i]=='(') cnt++;
            else{
                if(cnt>0){
                    cnt--;
                    ans += 2;
                }
            }
        }
        return ans;
    }
}