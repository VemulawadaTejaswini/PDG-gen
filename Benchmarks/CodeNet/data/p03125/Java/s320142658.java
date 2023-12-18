import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=bufferedReader.readLine().split(" ");
        int ans=(Integer.parseInt(s[1])%Integer.parseInt(s[0])==0)?Integer.parseInt(s[0])+Integer.parseInt(s[1]):Integer.parseInt(s[1])-Integer.parseInt(s[0]);
        System.out.println(ans);
    }
}