import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int[] map = new int[24*60*60];
			int n = sc.nextInt();
			if(n==0) break;
			while(n-->0){
				String s = sc.next();
				String e = sc.next();
				int start = Integer.valueOf(s.substring(0, 2))*3600 
						+ Integer.valueOf(s.substring(3, 5))*60
						+ Integer.valueOf(s.substring(6, 8));
				int end = Integer.valueOf(e.substring(0, 2))*3600 
						+ Integer.valueOf(e.substring(3, 5))*60
						+ Integer.valueOf(e.substring(6, 8));
				for(int i=start;i<end;i++){
					map[i]++;
				}
			}
			int max = 0;
			for(int i=0;i<3600*24;i++){
				if(max<map[i]){
					max = map[i];
				}
			}
			pr.println(max);
		}
		pr.flush();
		sc.close();
	}
}