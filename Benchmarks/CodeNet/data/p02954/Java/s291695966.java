import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();

		long[] A = new long[S.length()];

		Arrays.fill(A, 0);

		long r=0;
		int rIndx = -1;
		long l=0;
		boolean flg = true;
		for(int i=0;i<S.length();i++){
			if(flg){
				if(S.charAt(i)=='R'){
					r++;
				}else{
					l=1;
					rIndx=i-1;
					flg=false;
				}
			}
			else{
				if(S.charAt(i)=='L'){
					l++;
				}else{
					A[rIndx]=(l+r)/2;
					A[rIndx+1]=(l+r)/2;

					if(Math.abs(l+r)%2==1){
						if(l%2==0){
							A[rIndx]++;
						}else{
							A[rIndx+1]++;
						}
					}
					flg=true;
					r=1;

				}

			}
		}
		A[rIndx]=(l+r)/2;
		A[rIndx+1]=(l+r)/2;

		if(Math.abs(l-r)%2==1){
			if(l%2==0){
				A[rIndx]++;
			}else{
				A[rIndx+1]++;
			}
		}
		for(int i=0;i<S.length()-1;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println(A[S.length()-1]);
	}
}
