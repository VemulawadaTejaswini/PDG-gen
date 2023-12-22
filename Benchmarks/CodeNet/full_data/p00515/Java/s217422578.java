import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int t[] = new int[5];
		int sum = 0;
		for(int i = 0; i < t.length; i++){
			t[i] = sc.nextInt();
			if(t[i] < 40) t[i] = 40;
			sum += t[i];
		}
		System.out.println(sum / 5);
	}
}