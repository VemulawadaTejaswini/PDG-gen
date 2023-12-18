import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int max = 0;
		for(int i = 0; i < 32; i++){
			int m = i;
			if(max<=m && m<=n)
				max = m;
			for(int j = 0; j < 10; j++){
				m = m * i;
				if(max<=m && m<=n)
					max = m;
				if(m>n)
					break;
			}
		}
		System.out.println(max);
	}
}