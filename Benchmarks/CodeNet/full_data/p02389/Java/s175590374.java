import java.io.*;

class Main{
public static void main(String[] args) throws IOException {

 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 
 int a = Integer.parseInt(br.readLine());
 int b = Integer.parseInt(br.readLine());
  
 int area = a * b;
 int areaLength = ( a + b ) * 2;
 System.out.println(area + " " + areaLength);

}

}