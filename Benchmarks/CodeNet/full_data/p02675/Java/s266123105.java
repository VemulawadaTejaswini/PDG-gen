import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = 0;
		for(int i = 1;i>0;i++){
			int n = scan.nextInt();
			if(n>=0&n<=999) {
				a = n;
				break;
			}}
			if(a>=100) {
				for(int j =0;j<11;j++) {
					a=a-100;
					if(a<100) {
						break;
					}
					
				}
			}
			else {}
				
				if(a>=10) {
					for(int j =0;j<11;j++) {
						a=a-10;
						if(a<10) {
							break;
						}
					}
				}
					else {
					}
			
				if(a==2||a==4||a==5||a==7||a==9) {
					System.out.println("hon");
				}
				else if(a==0||a==1||a==6||a==8) {
					System.out.println("pon");
				}
				else {
					System.out.println("bon");
				}
		}
		
		
		
	}