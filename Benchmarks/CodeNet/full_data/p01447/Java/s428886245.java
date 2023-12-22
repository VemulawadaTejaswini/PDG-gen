import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double n = sc.nextDouble();
			int count = 0;
			while(n>1.0){
				n /= 3;
				count++;
			}
			System.out.println(count);
		}
	}	
}