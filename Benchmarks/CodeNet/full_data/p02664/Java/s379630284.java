
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		String T=scanner.nextLine(); //ここに文字列がはいる
		char[] chartable=new char[T.length()]; //一文字ずつの要素の配列
		int[] result=null;  //?があるところ
		char target='?';

		intable(chartable, T); //一文字ずつ配列に入れるのは成功

		/*for(int i=0; i<chartable.length; i++) {
			System.out.println(chartable[i]);
		}*/

		 //?がどこに入ってるか探す
		result=search(chartable, T.length(), target);

		/*for(int i=0; i<result.length; i++) {
		System.out.println(result[i]);
	    }*/

		if(result[0]==-1) {
			for(int i=0; i<chartable.length; i++) {
				System.out.print(chartable[i]);
			}

		}else{

			if(result[0]==0) {
				chartable[0]='D';
			}

			for(int i=0; i<result.length; i++) {
				if(chartable[result[i]-1]=='D') {
					chartable[result[i]]='P';
				}else {
					chartable[result[i]]='D';
				}
			}

			for(int i=0; i<chartable.length; i++) {
				System.out.print(chartable[i]);
			}

		}


		scanner.close();

	}

	//一文字ずつ配列に入れるメソッド
	static void intable(char[] table, String T) {
		for(int i=0; i<T.length(); i++) {
			table[i]=T.charAt(i);
		}

	}




	 //探索メソッド
	static int[] search(char[] chartable, int size, char target) {
		int count=0;
		int[] r=new int[size];

		for(int i=0; i<size; i++) {
			if(chartable[i]==target) {
				r[count]=i;
				count++;
			}
		}
		if(count>0) {
		int[] result=new int[count];
		for(int i=0; i<count; i++) {
			result[i]=r[i];
		}
		return(result);
		}else {
			int[] result2=new int[1];
			result2[0]=-1;
			return(result2);
		}
	}


}
