import java.io.*;

class Watch{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str1 = br.readLine();
     String[] str2 = str1.split(" ");
     int a = Integer.parseInt(str2[0]);
     int b = Integer.parseInt(str2[1]);
     int c = Integer.parseInt(str2[2]);
     int t;

     if (a > b){
      t = a;
      a = b;
      b = t;
     }
     if (b > c){
      t = b;
      b = c;
      c = t;
     }
     if (a > b){
       t = a;
       a = b;
       b = t;
     }
     System.out.println(a + " " + b + " " + c);
  }
}