import java.util.Scanner;
public class Main {
	void reverse(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = s.nextInt();
		}
		for(int i = n-1;i >= 0;i--){
			System.out.print(a[i]);
			if(i > 0){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.reverse();
	}
}