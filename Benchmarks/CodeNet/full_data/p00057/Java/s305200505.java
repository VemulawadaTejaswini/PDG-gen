import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n == 1)n = 2;
			else n = n * 2 +(n-2);
			System.out.println(n);
		}
	}
}