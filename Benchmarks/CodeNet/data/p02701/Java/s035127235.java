//import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt();
		int N = new java.util.Scanner(System.in).nextInt();
		int count = 1;
		String[] st = new String[N];
		for (int i =0; i < N; i++){
			//String string = sc.next();
			String string = new java.util.Scanner(System.in).nextLine();
			st[i] = string;
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