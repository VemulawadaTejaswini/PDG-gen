import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        int x = Integer.parseInt(num1);

        String num2 = br.readLine();
        int y = Integer.parseInt(num2);

        int area = x * y;
        int length = x * 2 + y * 2;

        System.out.println(area);
        System.out.println(length);
    }
}