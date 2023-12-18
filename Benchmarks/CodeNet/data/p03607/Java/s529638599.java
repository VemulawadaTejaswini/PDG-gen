import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int N = 0,A = 0,ans = 0;
		int array[];

		N = sc.nextInt();
		array = new int[N];

		for(int x = 0;x < array.length;x++){
			A = sc.nextInt();
			array[x] = A;
			loop : for(int y = 0;y < x;y++){
				if(array[x] == array[y]) {
					array[x] = 0;
					array[y] = 0;
					break loop;
				}
			}
		}

		for(int x = 0;x < array.length;x++){
			if(0 != array[x]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}