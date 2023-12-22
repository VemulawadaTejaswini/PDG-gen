import java.util.Scanner;
class Main{
	public static void main(String[] amge){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a [] = new int[n];
		for(int x = 0;x < n;x++){
			a[x] = scan.nextInt();
		}
		int max = a[0];
		int min = a[0];
		int tot = a[0];
		for(int y = 1;y < n;y++){
			if(max < a[y]){
				max = a[y];
			}
		}
		for(int t = 1;t < n;t++){
			if(min > a[t]){
				min = a[t];
			}
		}
		for(int k = 1;k < n;k++){
			tot = tot +a[k];
		}
		System.out.println(min +" "+ max +" "+ tot);
	}
}