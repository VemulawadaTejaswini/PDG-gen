import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			double n = sc.nextInt();
			n = n * 2 + Math.ceil(n/2-1);
			System.out.println(n);
		}
	}
}