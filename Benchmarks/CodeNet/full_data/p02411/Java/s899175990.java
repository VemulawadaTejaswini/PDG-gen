import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		while(true){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			
			if(m == -1 && f == -1 && r == -1) break;
			
			if(m == -1 || f == -1) str.append("F\n"); 
			else if(m+f >= 80) str.append("A\n");
			else if(m+f >= 65) str.append("B\n");
			else if(m+f >= 50) str.append("C\n");
			else if(m+f >= 30){
				if(r >= 50) str.append("C\n");
				else str.append("D\n");
			}
			else str.append("F\n");
			
			if(m == -1 && f == -1 && r == -1) break;
		}
		System.out.print(str);
		
	}
}