import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Toi junbi = new Junbi3();
		junbi.solve();
	}
}

interface Toi{
	public void solve();
}

class Junbi1 implements Toi{
	public void solve(){
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}

class Junbi2 implements Toi{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int i = 0; i < 3; i++) {
			System.out.println(array[array.length - (i + 1)]);
		}
	}
}

class Junbi3 implements Toi{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int[] array = new int[3];
			for (int j = 0; j < 3; j++) {
				array[j] = sc.nextInt();
			}
			Arrays.sort(array);
			double num = Math.sqrt(Math.pow((double)array[0], 2.) + Math.pow((double)array[1], 2.));
			if(Math.abs(num - (double)array[2]) < 1E-8){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
