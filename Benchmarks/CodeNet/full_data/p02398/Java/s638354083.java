import java.util.Scanner;

public class Main {
	
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int z=scanner.nextInt();
		int count=0;
		for(int i=x; i<=y; i++){
			if(z%i==0){
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}	

}