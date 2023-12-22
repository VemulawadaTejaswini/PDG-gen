import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int h = time / 3600;
        int m = (time % 3600) / 60;
        int s = (time % 3600) % 60;

        System.out.println(h +":"+ m +":"+ s);
    }
}