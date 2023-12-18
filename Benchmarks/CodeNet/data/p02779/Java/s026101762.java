import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int list[] = new int[n];
		int tmp;
		String result= "YES";
		for (int i=0;i<n;i++) {
			tmp =sc.nextInt();
			for (int j=0;j<list.length;j++) {
				if(tmp==list[j]) {
					result= "NO";
					break;
				}
			}
			list[i] = tmp;
			if("NO".equals(result)) {
				break;
			}
		}		
		System.out.println(result);		
	}

}
