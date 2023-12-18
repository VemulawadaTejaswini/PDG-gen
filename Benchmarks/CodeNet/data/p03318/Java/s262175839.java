import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while(n > 0){
			System.out.println(i+sb.toString());
			if(i < 9) i++;
			else{
				sb.append("9"); i = 1;
			}
			n--;
		}
	}
	static double f(int x){
		int aux = x; int sum = 0;
		while(aux > 0){
			sum += aux%10;
			aux/=10;
		}
		return x*1.0 / sum;
	}
}
