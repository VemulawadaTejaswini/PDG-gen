import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int ave = 0;
		int tmp;
		
		for(int i=0;i<5;i++){
			tmp = scan.nextInt();
			if(tmp < 40){
				tmp = 40;
			}
			ave += tmp;
		}
		System.out.println(ave/5);
	}
}