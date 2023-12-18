import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int tmp=0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++) {
				if(Math.pow(i, j)>tmp&&Math.pow(i, j)<X) {
					tmp = (int) Math.pow(i, j);}
				if(Math.pow(i, j)>X) {
						break;
				}
				
			}
			
		}
		System.out.println(tmp);	
	}
		
}

