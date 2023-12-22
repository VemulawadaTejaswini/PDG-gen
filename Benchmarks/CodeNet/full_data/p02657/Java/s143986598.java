import java.io.BufferedReader;
import java.io.InputStreamReader;
public class mul
{
  public void main(String args[])
  {
   // Scanner sc = new Scanner(System.in);
    
    java.io.BufferedReader x = new java.io.BufferedReader(new java.io.InputStreamReader(System.in))
    String s=(x.readLine()).split(" ");

int K=Integer.parseInt(s[0]);

int N=Integer.parseInt(s[1];
      
    int c=K*N;
    System.out.println(c);
  }
}