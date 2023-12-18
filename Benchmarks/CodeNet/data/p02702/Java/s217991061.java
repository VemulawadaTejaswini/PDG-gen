import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int math[]=new int[str.length()];
	int total=0;
	String[] strArray = new String[str.length()];
	 
	// 変数strの長さ分回す
	//https://yuu.1000quu.com/java_string_to_array
	for (int i = 0; i < str.length(); i++) {
	    // strの先頭から1文字ずつString型にして取り出す
	    String str2 = String.valueOf(str.charAt(i));
	    // 配列に順番に格納する
	    strArray[i] = str2;
	}
	for(int i=0;i<str.length();i++) {
		math[i]=Integer.parseInt(strArray[i]);
	}
	for(int i=0;i<str.length()-3;i++) {
		for(int j=i+3;j<str.length();j++) {
			int num=0;
			for(int k=0;k<=j-i;k++) {
				num+=math[j-k]*Math.pow(10,k);
			}
			if(num%2019==0) {
				total++;
			}
		}
	}
	System.out.println(total);
}
}