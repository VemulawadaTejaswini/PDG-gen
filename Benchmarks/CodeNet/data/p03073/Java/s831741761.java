import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int countA = 0;
		int countB = 0;
		int A =0;
		int B =1;
		for (int i = 0; i < input.length() ; i++) {
			int tmp = combertInt(input,i);
			if((i+2)%2 == 0){
				if(((A+2)%2)==0) {
					A=1;
				}else if(((A+2)%2)!= 0) {
					A=0;
					countA++;
				}
				
				if(((B+2)%2)==0) {
					B=0;
					countB++;
				}else if(((B+2)%2)!= 0) {
					B=0;
				}
				
			}else{
				if(((A+2)%2)==0) {
					A=1;
				}else if(((A+2)%2)!= 0) {
					A=0;
					countA++;
				}
				
				if(((B+2)%2)==0) {
					B=0;
				}else if(((B+2)%2)!= 0) {
					B=0;
					countB++;
				}
			}			
		}
		System.out.println(Math.min(countA, countB));
	}
	
	private static Integer combertInt(String s, int i) {
		return Integer.parseInt(s.substring(i,i+1));
	}
}
