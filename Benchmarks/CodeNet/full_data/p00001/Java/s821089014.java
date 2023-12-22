import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] yama = new int[10];
		for(int i = 0;i <= 9;i++){
			yama[i] = Integer.parseInt(br.readLine());
		}
		int dami = 0;
		for(int i = 0;i <= 8; i++){
			int x = i;
			for(int j = i + 1;j <= 9;j++){
				if(yama[x] < yama[j]){
					x = j;
				}
			}
			if(x != i){
				dami = yama[x];
				yama[x] = yama[i];
				yama[i] = dami;
			}
		}
		for(int i = 0;i <= 2;i++){
			System.out.println(yama[i]);
		}
	}
}