import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			//double preX,preY;
			String[] s = sc.nextLine().split("[\\s]+");
			long[] data = new long[s.length];
			for(int i=0;i<s.length;i++){
				data[i] = Long.parseLong(s[i]);
			}
			
			System.out.println(gcd(data[0],data[1])+" "+lcm(data[0],data[1]));
			
		}
	}
	
	public static long gcd(long a,long b){
		return b==0 ? a : gcd(b,a%b);
	}
	
	public static long lcm(long a,long b){
		return a*b / gcd(a,b);
	}
}