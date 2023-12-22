import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long m = n;
        System.out.print(n+":");
        for (int i=2; i<n*n; i++){
        	while (n%i==0) {
        		n/=i;
        		System.out.print(" "+i);
        	}
        }
        if (n!=1) System.out.print(" " +m);
        System.out.println();
	}
}