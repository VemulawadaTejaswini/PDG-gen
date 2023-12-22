import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(" ");

        int a = Integer.parseInt(num2[0]);
        int b = Integer.parseInt(num2[1]);

        int d = a / b;
        int r = a % b;
        float f = a / b;


        System.out.println(d + " " + r + " " + f);
    }
}