import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int[] data = new int[5];
		for(int i = 0; i < 5; i++){
			data[i] = scan.nextInt();
		}
		for(int i = 0; i < 4; i++){
			for(int j = 4; j > i; j--){
				if(data[j] > data[j - 1]){
					int sub = data[j];
					data[j] = data[j - 1];
					data[j - 1] = sub;
				}
			}
		}
		System.out.println(data[0] + " " + data[1] + " " + data[2]
			+ " " + data[3] + " " + data[4]);
	}
}