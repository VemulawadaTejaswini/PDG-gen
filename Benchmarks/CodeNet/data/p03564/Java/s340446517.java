import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int kaisu=sc.nextInt();
		int tasu=sc.nextInt();
		int moto=1;
		for(int i=0; i<kaisu; i++) {
			if(moto<tasu) {
				moto*=2;
			}
			else {
				moto+=tasu;
			}
		}
		System.out.println(moto);
	}
}