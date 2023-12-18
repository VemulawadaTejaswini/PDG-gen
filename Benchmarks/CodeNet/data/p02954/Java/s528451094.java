import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int[] ans = new int[W.length()];
		Arrays.fill(ans, 0);
		int indexL=0;
		int indexR=0;

		int countR=0;
		int countL=0;
		for(int i=0;i<W.length();i++){

			if(i!=0 && W.charAt(i)=='R' && W.charAt(i-1)=='L'){
				if((countL+countR)%2==0){
					ans[indexR]=(countL+countR)/2;
					ans[indexL]=(countL+countR)/2;
				}else{
					if(countL%2==1){
						ans[indexR]=countR/2+countL/2;
						ans[indexL]=countR/2+countL/2+1;
					}else{
						ans[indexR]=countR/2+countL/2+1;
						ans[indexL]=countR/2+countL/2;

					}
				}
				countR=0;
				countL=0;
			}

			if(W.charAt(i)=='R'){
				countR++;
				indexR=i;
			}else{
				countL++;
				indexL=indexR+1;
			}
		}

		if((countL+countR)%2==0){
			ans[indexR]=(countL+countR)/2;
			ans[indexL]=(countL+countR)/2;
		}else{
			if(countL > countR){
				ans[indexR]=countR/2+countL/2;
				ans[indexL]=countR/2+countL/2+1;
			}else{
				ans[indexR]=countR/2+countL/2+1;
				ans[indexL]=countR/2+countL/2;


			}
		}


		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ans.length;i++){
			sb.append(ans[i]+" ");
		}
		sb.deleteCharAt(sb.length()-1);

		System.out.println(sb.toString());
	}
}
