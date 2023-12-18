import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ct = 0;
		int tmp = 0;
		boolean flg = true;
		for(int i = 0; i < s.length(); i++){
			char n = s.charAt(i);
			if(n == 'A'|| n== 'C' || n == 'T'|| n == 'G'){
				if(flg){
					tmp++;
				}else{
					tmp = 1;
					flg = true;
				}
			}else{
				flg = false;
				if(tmp > ct){
					ct = tmp;
				}
				tmp = 0;
			}

		}
		System.out.println(ct);
	}
}