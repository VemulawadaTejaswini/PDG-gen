import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		String s="";
		while(n>0){
			s=(char)(n%26-1+'a')+s;
			n/=26;
		}
		String ss="";
		boolean b=true;
		for(int i=s.length()-1;i>=0;i--){
			if(Character.isLetter(s.charAt(i))){
				if(!b){
					if(s.charAt(i)=='a')
						ss='z'+ss;
					else{
						ss=s.charAt(i)+ss;
						ss='z'+ss;
					}
				}else
					ss=s.charAt(i)+ss;
			}else
				b=false;
		}

		System.out.println(ss);
	}
}