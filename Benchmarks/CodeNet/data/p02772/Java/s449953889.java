import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numInt = Integer.parseInt(br.readLine());
    
    String[] data = br.readLine().split(" ");
    
    for(String s: data){
      int num = Integer.parseInt(s);
      if(num % 2 == 0 && num % 3 != 0 && num % 5 != 0){
        System.out.println("DENIED");
        return;
      }
    }
    System.out.println("APPROVED");
  }
}
