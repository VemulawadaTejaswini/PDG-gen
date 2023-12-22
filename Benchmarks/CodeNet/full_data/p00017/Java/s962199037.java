import java.util.Scanner;

public class Main{
	private static Scanner scan;
	static String alfa[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
        String st[] = new String[80];
		while(scan.hasNext()){
        	String str = scan.next();
        	int n = str.length();
        	for(int i = 0;i < n;i++){
        		st[i] = "" + str.charAt(i);
        	}
        	while(true){
        		String string = "";
        		change_char(st,n,1);
        		for(int j = 0;j < n;j++)string = string + st[j];
        		if(string.indexOf("the") + string.indexOf("this") + string.indexOf("that") > -3){
        			System.out.println(string);
        			break;
        		}
        	}
        }
		System.exit(0);
	}
	static void change_char(String a[],int i,int j){
		for(int k = 0;k < i;k++){
			for(int l = 0;l < 26;l++){
				if(a[k].equals(alfa[l])){
					int m = 0;
					if(l + j >= 26)m = 26;
					a[k] = alfa[l + j - m];
					break;
				}
			}
		}
	}
}