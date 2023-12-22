import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String answer="";
		answer+=change(sc.next());
		int count=0;
		while(count<11){
			answer+=" "+change(sc.next());
			count++;
		}
		System.out.println(answer);
	}
	static String change(String str){
		char[] apple={'a','p','p','l','e'};
		char[] peach={'p','e','a','c','h'};
		char[] c=str.toCharArray();
		if(str.length()>=apple.length){
			for(int i=0;i<str.length()-apple.length+1;i++){
				boolean appleFlag=true;
				boolean peachFlag=true;
				for(int j=0;j<5;j++){
					if(c[j+i]!=apple[j]){
						appleFlag=false;
					}
					if(c[j+i]!=peach[j]){
						peachFlag=false;
					}
				}
				if(appleFlag){
					for(int j=0;j<5;j++){
						c[i+j]=peach[j];
					}
					i+=5;
				}
				if(peachFlag){
					for(int j=0;j<5;j++){
						c[i+j]=apple[j];
					}
					i+=5;
				}
			}
			str=String.valueOf(c);
		}
		return str;
	}
}