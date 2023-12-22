import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){
			int count = scan.nextInt();
			int[] a = new int[count];
			for(int j = 0;j < count;j++){
				a[j] = scan.nextInt();
			}
			int up = 0;
			int down = 0;
			int t;
			for(int j = 0;j < count-1;j++){
				t = a[j+1] - a[j];
				if(up < t){
					up = t;
				}else if(down > t){
					down = t;
				}
			}
			System.out.println(up + " " + (-down));
		}
	}
}