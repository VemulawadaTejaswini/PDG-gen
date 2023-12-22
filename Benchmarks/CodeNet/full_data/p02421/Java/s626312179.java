import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int taro=0;
		int hanako=0;
		int asum=0;
		int bsum=0;
		//ターン数を入力
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.next());
		String[] ary= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] num=new int[26];
		for(int i=0;i<26;i++) {
			num[i]=i+1;
		}
		//ターン数分繰り返す
		for(int i=0;i<n;i++) {
			asum=0;
			bsum=0;
			//カード入力
			String a=sc.next();
			//カードの文字数をカウント
			int x=a.length();
			//aからk個目の文字を取り出す
			for(int k=0;k<x;k++) {
				String A=a.substring(k,k+1);
				for(int j=0;j<26;j++) {
					if(A.equals(ary[j])) {
						asum+=num[j];
					}
				}
			}
			//カード入力
			String b=sc.next();
			//カードの文字数をカウント
			int y=b.length();
			//aからk個目の文字を取り出す
			for(int k=0;k<y;k++) {
				String B=b.substring(k,k+1);
				for(int j=0;j<26;j++) {
					if(B.equals(ary[j])) {
						bsum+=num[j];
					}
				}
			}
			if(asum>bsum) {
				taro+=3;
			}else if(asum<bsum){
				hanako+=3;
			}else if(asum==bsum){
				taro+=1;
				hanako+=1;
			}
		}
		System.out.println(taro+" "+hanako);
		//System.out.println(asum+" "+bsum);
	}

}

