import java.io.*;
class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int a = 1000;
    while(a<n){
      a = a+1000;
	 // System.out.println("Executed");
	}
    a = a - n;
    System.out.println(a);
  }
}