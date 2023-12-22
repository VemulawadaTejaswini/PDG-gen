import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		String now=s.nextLine();
		char ans[]=now.toCharArray();
		for(int i=0;i<now.length()-4;i++){
			if(now.substring(i,i+5).equals("apple")){
				ans[i]='p';
				ans[i+1]='e';
				ans[i+2]='a';
				ans[i+3]='c';
				ans[i+4]='h';
			}else if(now.substring(i,i+5).equals("peach")){
				ans[i]='a';
				ans[i+1]='p';
				ans[i+2]='p';
				ans[i+3]='l';
				ans[i+4]='e';
			}
		}
		System.out.println(new String(ans));
	}
}