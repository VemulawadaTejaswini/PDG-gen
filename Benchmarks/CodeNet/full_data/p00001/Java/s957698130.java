import java.util.Scanner;


 public class Main{
	public static void main(String[] args){
		int max = 10, temp;
		int mountain[] = new int[max];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < max; i++) mountain[i] = sc.nextInt();
		for(int i = 0; i < max; i++){
			for(int j = max; j > i; j--){
				if(mountain[j-1] > mountain[j]){
					temp = mountaim[j-1];
					mountain[j-1] = mountain[j];
					mountain[j] = temp;
				}
			}
		}
		for(int i = 0; i < 3; i++) System.out.println(mountain[i]);
	}
}