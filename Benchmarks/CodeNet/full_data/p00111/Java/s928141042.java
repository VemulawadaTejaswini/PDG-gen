import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String p[]={"101","000000","000011","10010001","010001","000001","100101","10011010","0101","0001","110"
		,"01001","10011011","010000","0111","10011000","0110","00100","10011001","10011110","00101","111","10011111"
		,"1000","00110","00111","10011100","10011101","000010","10010010","10010011","10010000"};
		String c=" ',-.?ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String q[]={"11010","11110","11100","11101","11011","11111","00000","00001","00010","00011","00100"
		,"00101","00110","00111","01000","01001","01010","01011","01100","01101","01110","01111","10000","10001"
		,"10010","10011","10100","10101","10110","10111","11000","11001"};
		while(s.hasNext()){
			String k=s.nextLine();
			String a="";
			for(int i=0;i<k.length();i++)
				for(int j=0;j<32;j++)if(k.charAt(i)==c.charAt(j))a+=q[j];
			while(a.length()%5!=0)a+="0";
			String e="";
			int at=0;
			for(int i=0;i<a.length()/5;i++){
				for(int j=0;j<32;j++){
					if(at+p[j].length()<a.length()&&a.substring(at,at+p[j].length()).equals(p[j])){
						e+=c.charAt(j);
						at+=p[j].length();
					}
				}
			}
			System.out.println(e);
		}
	}
}