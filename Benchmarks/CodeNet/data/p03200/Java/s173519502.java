import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String s = sc.next();
		int ans =0 ;
		
		boolean flag = true;
		while(flag){
			flag = false;
			for(int i = 0;i < s.length()-1;i++){
				if(s.charAt(i) == 'B' && s.charAt(i+1)=='W'){
					ans++;
					flag = true;
				}

			}			
			s = s.replace("BW", "WB");
			if(s.charAt(0) == 'W'){
				s = s.substring(1);
			}

		}
		
		System.out.println(ans);

	}
}

