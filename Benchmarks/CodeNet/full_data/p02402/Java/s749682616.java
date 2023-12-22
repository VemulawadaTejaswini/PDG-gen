import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		int min=1000000, max=-1000000;
		long sum=0;
		
		if(0<=size && size<=10000){
			for(int i=0; i<array.length; i++){
				array[i] = scanner.nextInt();
				if(-1000000<=array[i] && array[i]<=1000000){
					if(min>array[i])min=array[i];
					if(max<array[i])max=array[i];
					sum +=array[i];	
				}
			}	
		}
		System.out.println(min+" "+max+" "+sum);
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}