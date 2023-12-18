import java.util.Scanner;

public class Main {
	public void syllables(int A,int B,int C) {
		
			switch(A) {
			case 5:
				if((B==5&&C==7)||(B==7&&C==5)) {
					System.out.println("YES");
					System.out.println("Using three phrases of length " +A+", "+B+" and "+C+", it is possible to construct a Haiku.");

				}else {
					System.out.println("NO");
				}
				break;
			case 7:
				if(B==5&&C==5) {
					System.out.println("YES");
					System.out.println("Using three phrases of length " +A+", "+B+" and "+C+", it is possible to construct a Haiku.");

				}else {
					System.out.println("NO");
				}
				break;
			default:
				System.out.println("NO");
				break;
			}
		}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
	        int A=sc.nextInt();
	        int B=sc.nextInt();
		int C=sc.nextInt();
		new Main().syllables(A,B,C);
		
	}
	

}
