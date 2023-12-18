import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = br.readLine();
                String[] tokens = line.split(" ");
		int n = Integer.parseInt(tokens[0]);
		int k = Integer.parseInt(tokens[1]);
		int sum = 0;
		for(int i = 0; i < tokens.length - 2; i++) {
			int la = Math.abs(Integer.parseInt(tokens[i + 2]));
			int lb = Math.abs(Integer.parseInt(tokens[i + 2]) - k);
			if(la - lb > 0) {
				sum += lb * 2 ;
			} else {
				sum += la * 2;
			}
		}
		System.out.println(sum);
	}
}
