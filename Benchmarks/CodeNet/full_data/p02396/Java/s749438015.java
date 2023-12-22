public class Main{
	public static void main(String[] args){
		//
    int[] data = new int [10001];
		for(int i=0; i < 10001; i++){
			String input = new java.util.Scanner(System.in).nextLine();
			data[i] = Integer.parseInt(input);
			if( data[i] == 0){
				break;
			}
		}
		for(int i=0; i < 10001; i++){
			if( data[i] == 0){
				break;
			}
			System.out.print("Case "+ (i+1) + ": " + data[i]);
		}
		//
	}
}