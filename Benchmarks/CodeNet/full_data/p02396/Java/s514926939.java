public class Main{
	public static void main(String[] args){
		//
		int[] data = new int[10000];
		for(int i = 0; i < 10000; i++){
			int input = new java.util.Scanner(System.in).nextInt();
			data[i] = input;
			if( data[i] == 0 ){
				break;
			}
		}
		for(int i = 0 ; i < data.length ; i++){
			if( data[i] == 0){
				break;
			}else{
				System.out.println("Case "+ (i+1) + ": " + data[i]);
			}
		}
		//
	}
}