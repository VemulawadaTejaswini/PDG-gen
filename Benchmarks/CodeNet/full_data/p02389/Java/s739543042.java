import java.io.*;

class Main{
public static void main(String[] args) throws IOException {

 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 int a; 
 int b;

  a = Integer.parseInt(br.readLine());
  b = Integer.parseInt(br.readLine());
  
  System.out.print(a * b);
  System.out.print(" ");
  System.out.println(2*a+2*b);



}

}