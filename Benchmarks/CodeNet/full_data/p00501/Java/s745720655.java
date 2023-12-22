package AOJ0578;
import java.util.*;

public class Main {
	static boolean search(String tar , String str){
		boolean f = false;
		for(int j=0;j<str.length();j++){
			if(tar==str)return true;
			if(tar.charAt(0)==str.charAt(j)){//ターゲットの先頭文字と一致する文字をstrから探す
				int cnt=0;
				for(int i=j+1;i<str.length();i++){//２文字目の探索
					cnt++;
					if(str.length()<=i+cnt)break;//枝刈り
					if((tar.length()-1)*cnt>=str.length())break;//枝刈り
					
					if(tar.charAt(1)==str.charAt(i)){
						for(int k=2;k<tar.length();k++){//３文字目以降の文字の探索
							int m = i;
							if(tar.charAt(k)==str.charAt(m+cnt))f = true;
							else {
								f = false;
								break;
							}
						}
						if(f==true) return f;
					}
				}
			}
		}		
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		String tar = sc.next();
		for(int i=0;i<n;i++){
			String s = sc.next();
			if(search(tar,s))ans++;
		}
		System.out.println(ans);
	}
}