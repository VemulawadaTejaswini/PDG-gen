import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int tmp = 0;
		int min = 0;
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		str = sc.next();
		min = str.length();
		for(int i =0; i < n; i++){
			tmp = 0;
			for(int j = 0; j < i; j++){
				if(str.substring(j,j+1).equals("W")){
					tmp++;
				}
			}
			for(int j = i; j < str.length(); j++){
				if(str.substring(j,j+1).equals("E")){
					tmp++;
				}
			}
			
			min = Math.min(min,tmp);
			
		}
		
		System.out.println(min);
	}
}
