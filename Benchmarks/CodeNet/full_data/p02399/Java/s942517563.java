import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int d = a / b;
        int r = a % b;
        float f =(float) a / b;

        sb.append(d).append(" ").append(r).append(" ").append(f);
        System.out.println(sb);
    }
}