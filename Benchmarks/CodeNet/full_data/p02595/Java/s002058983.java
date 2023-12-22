import java.io.*;
class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s[] = br.readLine().trim().split(" ");
    int n = Integer.parseInt(s[0]);
    int d = Integer.parseInt(s[1]);
    int count =  0;
    while(n-- >0){
      s = br.readLine().trim().split(" ");
      int x1 = Integer.parseInt(s[0]);
      int x2 = Integer.parseInt(s[1]);
      double r = Math.sqrt((x1*x1) + (x2*x2));
      if(r <= d)
        count++;
    }
    System.out.println(count);
  }
}