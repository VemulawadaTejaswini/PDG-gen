import java.util.Scanner;

public class Main {
		static int CARD_MAX=1000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		for(int i=0;i<n;i++){
			String order = scan.next();
			if(order.equals("replace")){
				str = replaceString(str,scan.nextInt(),scan.nextInt(),scan.next());
			}else if(order.equals("reverse")){
				str = reverseString(str,scan.nextInt(),scan.nextInt());
			}else if(order.equals("print")){
				printString(str,scan.nextInt(),scan.nextInt());
			}

		}
	}



public static void printString(String str,int a,int b){
	for(int i=a;i<=b;i++){
		System.out.print(str.charAt(i));
	}
	System.out.println();
}


public static String replaceString(String str,int a,int b,String p){
	String target="";
	for(int i=a;i<=b;i++){
		target = target + str.charAt(i);
	}

	str.replace(target, p);

	return str;
}

public static String reverseString(String str,int a,int b){
	String reverse="";
	String target="";
	for(int i=a;i<=b;i++){
		target = target + str.charAt(i);
	}

	for(int i=a-1;i<b;i++){
		reverse =str.charAt(i) + reverse  ;
	}

	str.replace(target, reverse);
	return str;
}


}