import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int X[]=new int[M];
		int len[]=new int[M-1];
		int z=0,max1=0;
		for(int i=0;i!=M;i++) {
			X[i]=stdIn.nextInt();//入力～
		}
		Arrays.sort(X);
		for(int i=1;i!=M;i++) {
			len[i-1]=X[i]-X[i-1];
		}//多分差を入れてる
		Arrays.sort(len);//ここで差のそーとね(多分)
		if(M>N) {
			for(int i=0;i!=M-1-(N-1);i++) {
				//M-1→渡らせるべき間
				//N-1→渡んなくてもいい間の数
				//差が小さい順にソートしてるから、最後のN-1個は渡んなくてもいい!!
				max1+=len[i];
			}
		}
		System.out.println(max1);
	}
}