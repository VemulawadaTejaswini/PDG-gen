import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//入力
		String name=sc.next();
		String[] sign=new String[n];
		for(int i=0;i<n;i++){
			sign[i]=sc.next();
		}//
		int ans=0;
		String test="";
		for(int i=0;i<n;i++){
			for(int j=0;j<sign[i].length();j++){//取り出す看板の文字
				test+=sign[i].charAt(j);
				for(int k=1;k<sign[i].length();k++){//次の文字
					test+=sign[i].charAt(k);
					if(test.equals(name)){
						ans++;
						test="";
						break;
					}
					if(test.length()>sign[i].length()){
						test="";
						break;
					}
				}
				test="";
			}
		}
		System.out.println(ans);
	}
}