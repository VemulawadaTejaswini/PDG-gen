
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();//ボード数
		String sample = s.next();//s.next();//元となる文字
		char[] samples = new char[sample.length()];//sample.length()];//[sample.length()];
		for(int i=0; i<samples.length; i++){
			samples[i] = sample.charAt(i);
			//System.out.println(samples[i]);
		}
		String[] board = new String[N];
		int count=0;
		int muri = 2;
		/*int iend = 0;
		int jend = 0;
		int kend = 0;*/
		int result = 0;
		do{
			board[0] = s.next();
			N--;
		end: for(int i=0; i<board[0].length(); i++){
			if(samples[0]!=board[0].charAt(i)) continue;
			//System.out.println("i="+i);
			//iend=i;
			for(int j=i; j<board[0].length(); j++){
				if(samples[1]!=board[0].charAt(j)) continue;
				//System.out.println("j="+j);
				count = j-i;
				int flag = 2;
				//jend = j;
				muri = 2;
				a:for(int k=j+count; k<board[0].length();k+=count){
					System.out.println("k:"+k);
					if(samples[muri]!=board[0].charAt(k)){
						//k+=count;
						break a;
					}
					//System.out.println("k="+k);
					muri++;
					flag++;
					//kend = k;
					if(flag==sample.length()){
						result++;
						break end;
					}
				}
			}
		}
		}while(N>0);
		//System.out.println(iend+" "+jend+" "+kend);
		System.out.println(result);
	}
}