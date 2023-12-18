import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			int k=sc.nextInt();
			String res="";
			for(int i=0;i<str.length();i++){
				if(i+1!=str.length() && 'z'-str.charAt(i)+1<=k){
					res+="a";
					k-='z'-str.charAt(i)+1;
				}
				else if(i+1==str.length()){
					int a=str.charAt(i)-'a'+k;
					a%=26;
					res+=Character.toString((char)('a'+a));
				}
				else res+=Character.toString(str.charAt(i));
			}
			System.out.println(res);
		}
	}
}