import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(scan.hasNext()){
		int d=scan.nextInt();
		int s=0;
		for(int i=0;i*d<600;i++){
			s+=i*i*d*d*d;
		}
		System.out.println(s);
		}
	}

}