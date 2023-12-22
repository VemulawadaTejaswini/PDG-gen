import java.io.*;

class Main {
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b;
    a = Integer.parseInt(br.readLine());
    b = Integer.parseInt(br.readLine());
    
    System.out.println(a * b);
  }
}