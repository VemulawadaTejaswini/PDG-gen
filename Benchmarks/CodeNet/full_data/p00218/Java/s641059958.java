import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		Main app=new Main();
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			findans(n);
		}

	}
	static void findans(int n){
		for(int i=0;i<n;i++){
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			if(a==100||b==100||c==100) System.out.println("A");
			else if(a+b>=180)System.out.println("A");
			else if(a+b+c>=240)System.out.println("A");
			else if(a+b+c>=210)System.out.println("B");
			else if(a+b+c>=150&&(a>=80||b>=80))System.out.println("B");
			else  System.out.println("C");

		}

	}
}