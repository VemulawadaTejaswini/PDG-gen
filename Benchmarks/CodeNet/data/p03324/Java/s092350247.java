import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		for(int i=0; i<n; i++){
			result += Math.pow(100, d)
		}
		System.out.println(result);
	}
}
