import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int i=0;
		Scanner sc = new Scanner(System.in);
		while(i==0){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1){
				i=1;
			}else{
				if(m == -1 || f == -1){
					System.out.println("F");
				}
				if(m+f>=80){
					System.out.println("A");
				}
				if(m+f>=65 && m+f<80){
					System.out.println("B");
				}
				if(m+f>=50 && m+f<65){
					System.out.println("C");
				}
				if(m+f>=30 && m+f<50){
					if(r>=50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}
				if(m+f<30){
					System.out.println("F");
				}
			}
		}
	}
}