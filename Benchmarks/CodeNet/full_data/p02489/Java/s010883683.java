import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		for(int i=0;;i++){
			int x=stdIn.nextInt();
			if(x==0)break;
			System.out.println("Case "+ i + ": "+x);
		}
	}
}