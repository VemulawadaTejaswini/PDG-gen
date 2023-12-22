import java.io.*;


class Cubic{
    public static void main(String[] args) throws IOException{
       System.out.print("整数を入力してください:");

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String str = br.readLine();

       int x = Integer.parseInt(str);

       System.out.println("3乗の結果は" + (x*x*x) + "です.");

    }
}
