import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	String ans = "Yes";
	String[] S;
	boolean flg=false;

	Main(){
		// 文字列の入力
		String s = sc.next();
		S = s.split("");

		for(String str:S){
			if(flg){
				if(str.equals("R")){
					ans = "No";
					break;
				}
              	flg = false;
			} else {
				if(str.equals("L")){
					ans = "No";
					break;
				}
              	flg = true;
			}
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}