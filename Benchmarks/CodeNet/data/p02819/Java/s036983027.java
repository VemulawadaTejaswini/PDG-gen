import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean flag = false;
		if(n == 2)  flag = true;
		if(n != 2 && n % 2 == 0)  flag = false;

while(flag == false){
		for(int i = 3; i <= Math.sqrt(n); i += 2){
			if(n % i == 0) flag = false;
		}
			if(flag == false)n++;
}
		System.out.print(n);
	}
}
