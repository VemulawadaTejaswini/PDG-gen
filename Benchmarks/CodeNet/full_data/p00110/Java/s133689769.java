
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str=cin.next();
			String s1 = str.substring(0, str.indexOf('+'));
			String s2 = str.substring(str.indexOf('+')+1, str.indexOf('='));
			String s3 = str.substring(str.indexOf('=')+1);
			int output=-1;
			for(int i = 0; i < 10;i++){
				String r1= s1.replace('X',(char)( i+'0'));
				String r2= s2.replace('X',(char)( i+'0'));
				String r3= s3.replace('X',(char)( i+'0'));
				if(r1.charAt(0)=='0'&&r1.length()!=1||r2.charAt(0)=='0'&&r2.length()!=1||r3.charAt(0)=='0'&&r3.length()!=1){
					continue;
				}
				
				int x = Integer.parseInt(r1);
				int y = Integer.parseInt(r2);
				int z = Integer.parseInt(r3);
				if(x+y==z){
					output=i;
				}
			}
			if(output==-1){
				System.out.println("NA");
			}
			else{
				System.out.println(output);
			}
		}

	}

}