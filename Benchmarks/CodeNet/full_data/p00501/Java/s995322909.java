
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	//３文字目以降の探索
	//引数のnはターゲットの看板のどこを探索しているか
	//引数のpadは隙間
	static boolean paddingcheck(String tar,String str,int n,int pad){
		boolean f=false;
		for(int i=2;i<tar.length();i++){
			if(n+i*pad>=str.length()){f=false;break;}//
			if(tar.charAt(i)==str.charAt(n+i*pad))f = true;
			else {
				f = false;
				break;
			}
		}

		return f;
	}
	//２つの引数の文字列で看板が作れるかどうか判定するクラスメソッド
	static boolean search(String tar , String str){
		boolean f = false;
		for(int j=0;j<str.length();j++){
			if(tar.equals(str))return true;
			if(tar.charAt(0)==str.charAt(j)){
				int cnt=0;
				for(int i=j+1;i<str.length();i++){
					cnt++;
					if(str.length()<j+cnt)continue;
					if(tar.charAt(1)==str.charAt(i)){
						if((j+tar.length()-1*cnt)>str.length())break;//
						f = paddingcheck(tar,str,j,cnt);
						if(f==true) return f;
					}
				}
			}
		}		
		return f;
	}
	
	void doIt(){//クラス変数scに対しての操作を決めるメソッド
		int n = sc.nextInt();
		int ans = 0;
		String tar = sc.next();
		for(int i=0;i<n;++i){
			String s = sc.next();
			if(search(tar,s))ans++;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}