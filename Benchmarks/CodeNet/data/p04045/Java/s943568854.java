import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int k = sc.nextInt();
		char d[] = new char[k];
		StringBuffer ans = new StringBuffer();

		for (int i = 0; i < k ;i++) {
			d[i] = sc.next().charAt(0);
		}

		char x;
		int count =1;
		for (int i= n.length() -1; i >= 0 ;i--, count++){
			x = n.charAt(i);
			for(int j=0; j < k ;j++) {
				if(x == d[j]){
					if(x == '9'){
						x = 0;
						n = String.valueOf(Integer.parseInt(n) + Math.pow(10, count));
					} else {
						int y =  Integer.parseInt("" + x) + 1;
						x = (char)('0' + y);
					}
				}else{
					ans.insert(0, x);
					break;
				}
			}
		}

		System.out.println(ans);


		sc.close();
	}
}
