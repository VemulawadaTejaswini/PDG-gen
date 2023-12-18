import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		int j = 0;
		
		if(a - b > k) 
		j += 1;
		if(a - c > k)
		j += 1;
		if(a - d > k) 
		j += 1;
		if(a - e > k) 
		j += 1;
		if(b - c > k) 
		j += 1;
		if(b - d > k) 
		j += 1;
		if(b - e > k) 
		j += 1;
		if(c - d > k) 
		j += 1;
		if(d - e > k) 
		j += 1;
		
		if( j > 0){
		System.out.println(":(");
		}else{
			System.out.println("Yay!");
		}
	}
}
