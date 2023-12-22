import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int x=scanner.nextInt();
			int i=1;
			if(x==0){
				break;
			}
			System.out.println("Case "+i+": "+x);
			i++;
			
		}
		
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}