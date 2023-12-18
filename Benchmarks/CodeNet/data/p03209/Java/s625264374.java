import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int o = sc.nextInt();
		long count = 0;
		String e = pat(d,"P");
		char[] l = e.toCharArray();
		char p ='P';
		for(int i = e.length()-o-1; i < e.length(); i++){
			if(p == l[i]){
				count++;
			}
		}
		System.out.println(count);
	}


public static String pat(int N, String a){
	String b = "B" + a +"P"+a+"B";
	if(N==0){
		return b;
	}
	return pat(N-1,b);
	
}
}