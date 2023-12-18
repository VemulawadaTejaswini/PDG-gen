import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");
		int size = 1;
		int count = 0;
		for(int i = 1; i < n; i++) {
			if(!ss[i-1].equals(ss[i])) {
				size++;
			}else {
				count++;
			}
		}
		for(int i = 0; i < k; i++) {
			if(size >= 3) {
				size--;
				count += 2;
			}else if(size == 2){
				size--;
				count += 1;
			}else {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}

}