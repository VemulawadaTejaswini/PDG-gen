import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String s = input.readLine();
        String ans = "";
        StringBuffer before = new StringBuffer(s);
        StringBuffer after = new StringBuffer();
        while(n > 1){
            after = new StringBuffer();
                for(int i=0;i<before.length()-1;i++){
                int a = Integer.parseInt(before.substring(i,i+1));
                int b = Integer.parseInt(before.substring(i+1,i+2));
                after.append(Math.abs(a - b));
                }
            n = n - 1;
            before = after;
            if(n==1){
                ans = after.toString();
            }
        }
        System.out.println(ans);
    }
}
