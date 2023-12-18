import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] SS = S.split("",S.length());

		int ans = 0;
		String s1 = "";String s2 = "";
		for(int i = 0;i<S.length()-1;i++){
			s1 = SS[i];
			//文字列の長さが1の時はループ終了
			if(S.length()==1)break;
			s2 = SS[i+1];
			//001,110で始まる列は、最初の文字を書き換えてi=2に飛ぶ
			if((SS[0].equals("0")&&SS[1].equals("0")&&SS[2].equals("1"))||
					(SS[0].equals("1")&&SS[1].equals("1")&&SS[2].equals("0"))){
				ans++;
				i=2;
				continue;
			}
			//その他は逐次書き換える
			if(s2.equals(s1)&&s2.equals("0")){
				SS[i+1] = "1";
				ans++;
			}else if(s2.equals(s1)&&s2.equals("1")){
				SS[i+1] = "0";
				ans++;
			}
		}
		System.out.println(ans);
	}
}