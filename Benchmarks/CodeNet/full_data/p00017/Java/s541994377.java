import java.util.Scanner;
import java.io.*;

public class Main{
	public static boolean judge(char a, char b, int n){
		boolean flag = false;
		if( n < 0 ){
			n = 26+n;
		}
		int x = ( (int)(b-a) > 0 ) ? (int)(b-a) : (int)(a-b);
		if( x == n || x == 26-n ){
			flag = true;
		}
		return flag;
	}
	
	public static String decode(String s, int k){
		char[] temp = new char[s.length()];
		for(int i = 0; i < temp.length; i++){
			if( Character.isLetter(s.charAt(i)) ){
				if( (char)(s.charAt(i)+k) >= 'a' && (char)(s.charAt(i)+k) <= 'z' ){
					temp[i] = (char)(s.charAt(i)+k);
				} else if( (char)(s.charAt(i)+k) < 'a' ){
					temp[i] = (char)(s.charAt(i)+k+26);
				} else {
					temp[i] = (char)(s.charAt(i)+k-26);
				}					
			} else {
				temp[i] = s.charAt(i);
			}
		}
		String result = new String(temp);
		return result;
	}
	
	public static void main(String[] args){
		Scanner stdIn = null;
		String[][] s = new String[10000][];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.nextLine();
				s[index] = str.split(" ");
				int n = 0;
				for(int i = 0; i < s[index].length; i++){
					if( s[index][i].length() == 3 ){
						if( judge(s[index][i].charAt(0),s[index][i].charAt(1),12) && judge(s[index][i].charAt(1),s[index][i].charAt(2),3) ){
							n = 't'-s[index][i].charAt(0);
							break;
						}
					} else if( s[index][i].length() == 4 ){
						if( judge(s[index][i].charAt(0),s[index][i].charAt(1),12) && judge(s[index][i].charAt(1),s[index][i].charAt(2),7) && judge(s[index][i].charAt(3),s[index][i].charAt(2),19) ){
							n = 't'-s[index][i].charAt(0);
							break;
						} else if( judge(s[index][i].charAt(0),s[index][i].charAt(1),12) && judge(s[index][i].charAt(2),s[index][i].charAt(1),1) && judge(s[index][i].charAt(3),s[index][i].charAt(2),10) ){
							n = 't'-s[index][i].charAt(0);
							break;
						}
					}
				}
				for(int i = 0; i < s[index].length; i++){
					s[index][i] = decode(s[index][i], n);
				}
				index++;
			}
			for(int i = 0; i < index; i++){
				for(int j = 0; j < s[i].length-1; j++){
					System.out.print(s[i][j] + " ");
				}
				System.out.println(s[i][s[i].length-1]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}