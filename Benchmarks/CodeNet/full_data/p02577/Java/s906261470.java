import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n=br.readLine();
        int sum=0;
        for (int i = 0; i < n.length(); i++) {
            sum+=Integer.parseInt(n.charAt(i)+"");
        }
        if(sum%9==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
