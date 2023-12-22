import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String now=s.next();
			for(int i=0;i<now.length();i++){
				if(now.charAt(i)=='@'){
					for(int j=0;j<(int)(now.charAt(i+1)-'0');j++){
						System.out.print(""+now.charAt(i+2));
					}
					i+=2;
				}else System.out.print(""+now.charAt(i));
			}
			System.out.println();
		}
	}
}