import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,r,f;
		
		while(true){	
			m = sc.nextInt(); 
			r = sc.nextInt(); 
			f = sc.nextInt(); 
			if(m==-1 && r==-1 && f==-1)break;
			
			if(m==-1 || r==-1) System.out.println("F");
			else if(m+r>=80) System.out.println("A");
			else if(m+r>=65 && m+r<80) System.out.println("B");
			else if(m+r>=50 && m+r<65) System.out.println("C");
			else if(m+r>=30 && m+r<50){
				if(f>=50) System.out.println("C");
				else System.out.println("D");
			}
			else if(m+r<30) System.out.println("F");
				
		}
		
	}
		
		
		

	

}