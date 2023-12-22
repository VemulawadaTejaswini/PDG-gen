import java.util.Arrays;
import java.util.Scanner;

class Main{	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int mountain[] = new int[10];
			
			for(int i=0;i<10;i++){
				mountain[i] = sc.nextInt();
			}
			Arrays.sort(mountain);
			
			System.out.println(mountain[9]+" "+mountain[8]+" "+mountain[7]);
		}
		
	}
}