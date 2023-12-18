import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      InputStream inputStream = System.in;
      OutputStream outputStream = System.out;
      Scanner sc = new Scanner(inputStream);
      PrintWriter out = new PrintWriter(outputStream);
      int N = Integer.parseInt(sc.next());
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int ans = 0;
      for(int i = 1; i <= N; i++){
        int n = i;
        int digSum = 0;
      	while(0 < n){
          digSum += n % 10;
          n /= 10;
        }
        if(A <= digSum && digSum <= B){
        	ans += i;
        }
      }
      out.println(ans);
      out.close();
    }
}