import java.util.*; 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力文字列
		String w = sc.next();
		final String orgChars="abcdefghijklmnopqrstuvwxyz";

		String ans;
		if(w.length() % 2 == 1){
			ans = "No";
		}else{
			int flag = 0;
			int i = 0;
			while(flag == 0 && i != 26){
				if(w.length() - w.replaceAll(orgChars.substring(i,i),"").length() % 2 != 0){
					flag = 1;
				}
				i++;
			}
			if(flag == 1){
				ans = "No";
			}else{
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}


