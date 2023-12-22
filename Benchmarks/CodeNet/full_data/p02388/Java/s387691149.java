import java.io.*;
class main {

public static void main(String[] args)throws IOException

{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str=br.readLine();
int x =Integer.parseInt(str);

           System.out.println(x*x*x);

        }
}