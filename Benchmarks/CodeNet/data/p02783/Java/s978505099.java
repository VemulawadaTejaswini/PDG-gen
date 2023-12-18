import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String str[] = br.readLine().split(" ");
 
		int h = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
        br.close();

        System.out.println((h + a - 1) / a);
    }
}