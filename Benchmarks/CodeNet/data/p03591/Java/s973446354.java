import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s=sc.next();
		int limit=s.length();
		Character[] a=new Character[limit];
		
		for(int i=0;i<limit;i++){
	
	a[i]= s.charAt(i);
	
		}
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		// 出力
	if(limit>4){
	if(a[0]=='Y'&&a[1]=='A'&&a[2]=='K'&&a[3]=='I')
		System.out.println("YES");
		else
		System.out.println("NO");
	}
		else
		System.out.println("NO");
	
	   // System.out.println(a[2]);
	}
}