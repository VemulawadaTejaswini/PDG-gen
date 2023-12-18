import java.util.*;

public class Main{
	public static void main(String []args){
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		int num = inp.nextInt();
		
		for(int i=0;i<num;i++){
			int fun = inp.nextInt();
			String temp = "";
			if(fun==2){
				int fun2 = inp.nextInt();
				String str = inp.next();
				if(fun2==1){
					temp+=str;
					temp+=s;
					s = temp;
				}
				if(fun2==2){
					temp+=s;
					temp+=str;
					s = temp;
				}
			}
			if(fun==1){
				for(int j=s.length()-1; j>=0;j--){
					temp+=s.charAt(j);
				}
				s = temp;
			}
		}
		System.out.println(s);
	}
}
