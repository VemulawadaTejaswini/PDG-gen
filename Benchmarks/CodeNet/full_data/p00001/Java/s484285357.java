import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		int first = 0 ,second = 0 , third = 0;
		int[] hills = new int[10];
		for(int i = 0 ; i < 10 ; i ++ ){
			hills[i] = scanner.nextInt();
			if(hills[i]>first){
				third = second;
				second = first;
				first=hills[i];
			}
			else if(hills[i]>second){
				third = second;
				second=hills[i];
				}
			else if(hills[i]>third){
				third=hills[i];
				}
		}
		System.out.print(first+"\n"+second+"\n"+third+"\n");
		
    	}
}