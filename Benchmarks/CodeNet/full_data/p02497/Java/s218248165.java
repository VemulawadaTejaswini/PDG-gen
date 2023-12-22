import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
		int m=sc.nextInt();
		int f=sc.nextInt();
		int r=sc.nextInt();
		int k=m+f;
			if(m==-1 || f==-1){
			System.out.println("F");
			continue;
		}
		if(m==-1 && f==-1 && r==-1){
			break;
		}
		if(k>=80){
			System.out.println("A");
		}
		if(k<80 && k>=65){
			System.out.println("B");
		}
		if(k<65 && k>=50){
			System.out.println("C");
		}
		if(k<50 && k>=30){
			if(r>=50){
				System.out.println("C");
			}
			if(r<50){
				System.out.println("D");
			}
		}
		if(k<30){
			System.out.println("F");
		}
	
	}
}
}