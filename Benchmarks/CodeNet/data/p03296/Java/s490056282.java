import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;
		int atai = -1;
		int[] a = new int[101];
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
		}
		for(int i=1;i<N;i++){
			if(a[i]==a[i-1]){
				count++;
				a[i] = atai;
				atai--;
			}
		}
		System.out.println(count);
	}
}