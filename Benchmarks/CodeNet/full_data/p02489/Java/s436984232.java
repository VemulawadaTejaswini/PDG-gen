import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num;
        int i = 1;

        num = in.readLine();
        while(!(num.equals("0"))){
            System.out.printf("Case %s: %s%n", i, num);
            i++;
            num = in.readLine();
        }
    }
}