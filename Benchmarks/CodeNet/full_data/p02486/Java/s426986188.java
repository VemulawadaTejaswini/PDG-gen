import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try{
			while((str =	br.readLine())!=null){
				//入力
				int		n	=	Integer.parseInt(str.substring(0, str.indexOf(" ")));
				int		x	=	Integer.parseInt(str.substring(str.indexOf(" ")+1));
				if(n==0&&x==0){ break; }

				//1~nの値を持つ配列の作成
				int[] 	num =	new int[n];
				for(int i=1; i<n+1; i++){
					num[i-1] = i;
				}

				//組み合わせカウント用
				int count = 0;

				//条件
				for(int i=0; i<num.length; i++){
					for(int j=0; j<num.length; j++){
						for(int k=0; k<num.length; k++){
							if((i<j&&j<k)&&((num[i]+num[j]+num[k])==x)){
								count++;
							}
						}
					}
				}

				//出力
				System.out.println(count);
			}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}