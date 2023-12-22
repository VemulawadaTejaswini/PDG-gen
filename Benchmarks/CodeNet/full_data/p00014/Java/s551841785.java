import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(in.hasNextInt()){
			int n=in.nextInt(),sum=0;
			for(int i=n;i<600;i+=n)sum+=i*i*n;
			System.out.println(sum);
		}
	}
}