import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		boolean flg = false;

		for(int i=0;i<3;i++){
			for(int j=i+1;j<4;j++){
				if(S[i].equals(S[j])){
					for(int k=i+1;k<3;k++){
						for(int l=k+1;l<4;l++){
							if(S[k].equals(S[l]))flg=true;
						}
					}
				}
			}			
		}

		// 出力
		System.out.println(flg?"Yes":"No");
	}
}