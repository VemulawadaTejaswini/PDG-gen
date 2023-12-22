import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class main{
  public static void main(String[] args)throws IOException{
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
 
    String[] strAry = str.split(" ");
    int x = Integer.parseInt(strAry[0]);
    int y = Integer.parseInt(strAry[1]);
 
    System.out.println(x*y +" "+ 2*(x+y));
  }
}