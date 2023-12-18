import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
			h[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;
		while(true){
			int max = 0;
			int pos = 0;
			for(int i = 0; i < n; i++){
				if(h[i] > max){
					max = h[i];
					pos = i;
				}
			}
			if(max==0){
				System.out.println(count);
				return;
			}
			for(int i = 0; i < n; i++){
				if(i==pos){
					h[i] -= a;
				}else{
					h[i] -= b;
				}
			}
			count++;
		}

	}
}