import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//D
		int H = sc.nextInt();
		int W  =sc.nextInt();
		int count = 0;
		int[][] a = new int[H][W];
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Integer> x_dush = new ArrayList<>();
		ArrayList<Integer> y_dush = new ArrayList<>();
		for(int i  = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(int i  = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				if(a[i][j] % 2 == 1){
					if(j == W - 1){
						if(i != H -1){
							count++;
							a[i][j]--;
							a[i+1][j]++;
							x.add(i+1);
							y.add(j+1);
							x_dush.add(i+2);
							y_dush.add(j+1);
						}
					}else{
						count++;
						a[i][j]--;
						a[i][j+1]++;
						x.add(i+1);
						y.add(j+1);
						x_dush.add(i+1);
						y_dush.add(j+2);
					}
				}
			}
		}
		System.out.println(count);
		for(int i = 0 ; i < count ; i++){
			System.out.println(x.get(i)+" "+y.get(i)+" "+x_dush.get(i)+" "+y_dush.get(i)+" ");
		}
	}
}