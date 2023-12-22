package aoj;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			Separate(str);
		}
		sc.close();
	}
	public static void Separate(String str){
		String str2 = "";
		for(int j = 0; j < 9 ; j++){
			int num[] = new int[str.length()];
			String num2[] = new String [str.length()];
			//System.out.println(str);
			for(int i = 0 ; i < str.length();i++){
				num[i]=str.charAt(i)-48;
			}
			for(int i = 0 ; i < str.length()-1;i++){
				int p = 0;;
				p = (num[i]+num[i+1]) % 10;
				num2[i]=String.valueOf(p);	
				//System.out.println(p);
			}
			//System.out.println(" ");
			for(int i = 0 ; i < str.length()-1;i++){
				str2 = str2+num2[i];
			}	
			if(j == 8 )System.out.println(num2[0]);
			str = str2;
			str2 = "";
			
		}
	}
}
	