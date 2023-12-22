import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		byte states[] = new byte[10];
		int n, s, i, count;
		try {
			for(;;){
				buf = br.readLine();
				if(buf == null){
					break;
				}
				Scanner scanner = new Scanner(buf);
				if(!scanner.hasNext()){
					break;
				}
				n = scanner.nextInt();
				s = scanner.nextInt();
				if(n == 0 && s == 0){
					break;
				}
				count = Main.getCount(0, n, s, 0);
				for(i = 1; i <= n; i++){
					count /= i;
				}
				System.out.println(count);
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
	public static int getCount(int used, int remCount, int targetSum, int parentSum){
		int i, count = 0;
		if(parentSum > targetSum){
			return 0;
		}
		if(remCount == 0){
			if(parentSum == targetSum){
				/*
				for(i = 0; i < 10; i++){
					if((used & (1 << i)) != 0){
						System.out.print(i + " ");
					}
				}
				System.out.println();
				*/
				return 1; 
			}
			return 0;
		}
		for(i = 0; i < 10; i++){
			if((used & (1 << i)) == 0){
				count += Main.getCount(used | (1 << i), remCount - 1, targetSum, parentSum + i);
			}
		}
		return count;
	}
}