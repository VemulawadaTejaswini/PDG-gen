import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			
			int map[] = new int[10];
			
			for(int i =0; i < n; i++)
			{
				map[sc.nextInt()]++;
			}
			
			
			for(int i =0 ; i< 10;i++){
				String ans = "-";
				if(map[i]!=0){
					char[] ch = new char[map[i]];
					Arrays.fill(ch,'*');
					ans = new String(ch);
				}
				System.out.println(ans);
			}
			
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}