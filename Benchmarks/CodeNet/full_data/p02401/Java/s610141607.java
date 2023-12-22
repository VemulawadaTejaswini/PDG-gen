import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while(true){
      String line[] = br.readLine().split(" ");
      int a = Integer.parseInt(line[0]);
      String op = line[1];
      int b = Integer.parseInt(line[2]);
           
      if(op.equals("+"))  System.out.println(a+b);
      else if(op.equals("-"))  System.out.println(a-b);
      else if(op.equals("*"))  System.out.println(a*b);
      else if(op.equals("/"))  System.out.println(a/b);
      else  break;
    }
  }
}