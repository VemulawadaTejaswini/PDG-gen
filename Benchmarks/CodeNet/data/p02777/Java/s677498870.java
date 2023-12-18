import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String red = sc.next();
		String bule = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String ans = sc.next();
		
		if (ans.equals(red)){
			--A;
		}else{
			--B;
		}
		System.out.println(A + " " + B);
	
	}
}	