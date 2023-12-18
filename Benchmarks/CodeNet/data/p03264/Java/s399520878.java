import java.io.*;

class Pair{
	public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int k = Integer.parseInt(br.readLine());
      
      int kisu = (k / 2) + (k % 2);
      int gusu = k / 2;
      int sum = kisu + gusu;
      
      System.out.println(sum);
    }
}
