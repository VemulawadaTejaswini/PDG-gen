import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        
        System.out.println(a*b +" " + 2*(a+b));
        
	}

}