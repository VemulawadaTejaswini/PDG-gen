import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int s=stdIn.nextInt();
		System.out.println(s/3600+":"+s/60%60+":"+s%60);
	}
}
