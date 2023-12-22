import java.io.*;
  
class Main{
    public static void main(String[] args) throws Exception{
        Integer[] x;
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = br.readLine().Sprit(" ");

        System.out.println(x[0]*x[1] + " " + x[0]*2 + x[1]*2);
    }
}