import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String name=sc.next();//入力
		String[] sign=new String[n];
		for(int i=0;i<n;i++){
			sign[i]=sc.next();
		}//
		int ans=0;
		String test="";
		for(int i=0;i<n;i++){//看板の数
			for(int j=0;j<=sign[i].length()-name.length()+1;j++){//最初に取り出す文字。=なのはsign-nameだと必要な分まで引いてしまうから
				if(test.equals(name)){//signの長さがnameと最初から同じだとループで不具合
					test="";
					break;
				}
				for(int k=1;k<=(sign[i].length()-1-j)/2;k++){//次の文字までの数
					for(int l=0;l<name.length();l++){//testに格納する数
						test+=sign[i].charAt(l*k+j);
					}
					if(test.equals(name)){
						ans++;
						break;
					}else test="";
				}
			}
		}
		System.out.println(ans);
	}
}