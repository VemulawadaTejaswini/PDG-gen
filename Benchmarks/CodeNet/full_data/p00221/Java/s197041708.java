
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int n = cin.nextInt();
			int m = cin.nextInt();
			if(n+m==0)break;
			boolean[] mem=new boolean[n];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 1;i<n+1;i++)
				list.add(i);
			Arrays.fill(mem,true);
			int cnt=-1;
			for(int i = 0;i<m;i++){
				for(int j = 0;j<n;j++){
					cnt++;
					cnt=cnt%n;
					if(mem[cnt%n]){
						break;
					}
					
				}
				
				int r=right(i+1);
				String s =cin.next();
				int g=0;
				if(Character.isDigit(s.charAt(0)))
					g=Integer.parseInt(s);
				else if(s.equals("Fizz")){
					g=-1;
				}
				else if(s.equals("Buzz")){
					g=-2;
				}
				else if(s.equals("FizzBuzz")){
					g=-3;
				}
				//System.out.println(r+" "+cnt);
				if(r!=g){
					mem[cnt]=false;
				}
			}
			boolean first=true;
			for(int i = 0;i<mem.length;i++){
				if(mem[i]){
					if(first){
						System.out.print(i+1);
						first=false;
					}
					else{
						System.out.print(" "+(i+1));
					}
				}
			}
			System.out.println();
			
		}
		
	}
	static int right(int a){
		if(a%15==0)
			return -3;
		else if(a%5==0){
			return -2;
		}
		else if(a%3==0){
			return -1;
		}
		return a;
	}
	static int a(String s){
		return 0;
	}
}