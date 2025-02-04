import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long money = 1000;
		long stocks = 0;
		int i = 0;
		while(i<n){
			while(i+1<n && list[i]>=list[i+1]) i++;
			if(i==n-1 && stocks==0){
				System.out.println(money);
				return;
			}
			stocks += (money/list[i]);
			money -= (list[i]*(money/list[i]));
			while(i+1<n && list[i+1]>=list[i]) i++;
			if(i==n-1){
				money += stocks*list[i];
				stocks = 0;
				System.out.println(money);
				return;
			}
			money += (stocks*list[i]);
			stocks = 0;
			i++;
		}
		if(i==n-1) System.out.println(money);
	}
}