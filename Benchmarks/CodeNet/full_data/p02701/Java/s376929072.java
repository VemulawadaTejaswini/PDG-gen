import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		String[] st = new String[N];
		for (int i =0; i < N; i++){
			String a = sc.next();
			st[i] = a;
			for (int j = 0; j < i; j++){
				if (st[i].equals(st[j])){
					break;
				}
				else{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}