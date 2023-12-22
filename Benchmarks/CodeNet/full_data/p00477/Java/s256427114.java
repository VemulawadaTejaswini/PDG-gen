import java.util.Scanner;

class main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int sum=0;
		int i;
		for(i = 0 ;i < 4; i++){
			sum += stdIn.nextInt();
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
	}

}