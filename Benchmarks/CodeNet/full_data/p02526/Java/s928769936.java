import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, i, num;
		int ct = 0;
		boolean S[] = new boolean[10000010];
		
		n = input.nextInt();
		for (i = 0; i < n; i++){
			num = input.nextInt();
			S[num] = true;
		}
		n = input.nextInt();
		for (i = 0; i < n; i++){
			num = input.nextInt();
			if (S[num]){
				ct++;
			}
		}
		System.out.println(ct);
	}
}