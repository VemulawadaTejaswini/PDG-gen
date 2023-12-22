import java.util.Scanner;


public class Main {

	Scanner sc;
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=ni();
			n%=39;
			if(n==0)n+=39;
			System.out.println("3C"+String.format("%02d",n));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}
}