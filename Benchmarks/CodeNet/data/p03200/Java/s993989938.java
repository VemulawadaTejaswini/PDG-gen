import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		//		StringBuilder s = new StringBuilder(string);
		int ans =0 ;
		int p = 0;
		boolean flag = true;

		for(int i = 0;i < string.length();i++){
			//			System.out.println("i "+i+" "+s.charAt(i));
			if(string.charAt(i) == 'B'){
				if(flag){
					p = i;
					flag = false;
				}
			}else {
				if(!flag){
					ans += i -p;
					p += 1;
				}
			}

		}
		System.out.println(ans);

	}
}

