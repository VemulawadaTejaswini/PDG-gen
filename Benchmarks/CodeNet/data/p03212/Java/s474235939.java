import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal("", n));
    }
    public static int cal(String s, int N){
        if(s.equals("")){
            int ret = 0;
            ret += cal("3", N);
            ret += cal("5", N);
            ret += cal("7", N);
            return ret;
        }else{
            if(Integer.parseInt(s) > N) return 0;
            int ret = 0;
            boolean a = false;
            boolean b = false;
            boolean c = false;
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == '3')  a = true;
                else if(s.charAt(i) == '5') b = true;
                else if(s.charAt(i) == '7') c = true;
            }
            if(a && b && c) ret++;
            if(s.length() == 9) return ret;
            ret += cal(s+3, N);
            ret += cal(s+5, N);
            ret += cal(s+7, N);
            return ret;
        }
    }
}