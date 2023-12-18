import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int H = in.nextInt(), W = in.nextInt();
		String[] a = new String[H];
		a[0] = in.nextLine();
		for(int i = 0; i < H; i++){
			a[i] = in.nextLine();
		}
		int sum = 0;
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(a[i].charAt(j) == '#'){
					sum++;
				}
			}
		}
		if(sum == (H + W - 1)){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
	}
}