import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, f, r;
		
		
		while(true){
		m = scan.nextInt();
		f = scan.nextInt();
		r = scan.nextInt();
		if(m == -1 && f == -1 && r == -1){
			break;
		}
		if(m <= 50 && f <= 50 && r <= 100){
		if(m == -1 || f == -1){
			System.out.println("F");
		}else if(m+f>=80 && r == -1){
			System.out.println("A");
		}else if(m+f>=65 && m+f<80 && r == -1){
			System.out.println("B");
		}else if(m+f>=50 && m+f<65 && r == -1){
			System.out.println("C");
		}else if(m+f>=30 && m+f<50){
			if(r >= 50){
				System.out.println("C");
			}else{
			System.out.println("D");
		}
		}else{
			System.out.println("F");
			}
		 }
		}
		
	}
			
	
}