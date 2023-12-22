
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        long a = Long.parseLong(tokens[0]);
        long b = convertToLong(tokens[1]);
        long ans = (a*b)/100;
        System.out.println(ans);
    }

    private static long convertToLong(String s){
        long num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num=num*10 + (s.charAt(i)-'0');
            }
        }
        return num;
    }

}