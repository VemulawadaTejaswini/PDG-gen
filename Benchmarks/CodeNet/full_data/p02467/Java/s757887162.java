import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(n+":");
        for (int i=2; i*i<=n; i++){
        	while (n%i==0) {
        		if (i%4==0) break;
        		n/=i;
        		System.out.print(" "+i);
        	}
        }
        if (n!=1) System.out.print(" "+n);
        System.out.println();
        br.close();
	}
}