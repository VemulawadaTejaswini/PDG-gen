import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			long N =Long.parseLong(br.readLine());
			long A = Long.parseLong(br.readLine());
			long B = Long.parseLong(br.readLine());
			long C = Long.parseLong(br.readLine());
			long D = Long.parseLong(br.readLine());
			long E = Long.parseLong(br.readLine());
			
			long[] full = {N,0,0,0,0,0};
			long [] ninzu = {A,B,C,D,E};
			long num=N;
			long min=100000;
			long cnt=0;
			for(int i=0;i<5;i++) {
				if (ninzu[i]<=min) {
					min=ninzu[i];
				}
			}
			
			
			/*
			int N =Integer.parseInt(br.readLine());
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			int D = Integer.parseInt(br.readLine());
			int E = Integer.parseInt(br.readLine());
			
			int[] full = {N,0,0,0,0,0};
            int [] ninzu = {A,B,C,D,E};
			int num=N;
			int min=100000;
			int cnt=0;
			for(int i=0;i<4;i++) {
				if (ninzu[i]<=min) {
					min=ninzu[i];
				}
			}
			*/

			
			
			System.out.println(	N/min+ 5);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void init() {
		
	}
}
