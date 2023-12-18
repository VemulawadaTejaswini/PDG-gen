import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine())-1;
		String s = sc.nextLine();

		String[] spl = s.split("");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n;i++){
			if(i == k){
				sb.append(spl[i].toLowerCase());
			}else{
				sb.append(spl[i]);
			}
		}
		System.out.println(sb);
	}
}