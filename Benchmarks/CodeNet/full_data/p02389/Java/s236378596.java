import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
         String[] ab = in.readLine().split(" ");

         int a= Integer.parseInt(ab[0]);
         int b= Integer.parseInt(ab[1]);
         
        System.out.println(a*b +" " + 2*(a+b));
        
	}

}