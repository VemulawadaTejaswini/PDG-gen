
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		Long nu=sc.nextLong();
		
		String str="abcdefghijklmnopqrstuvwxyz";
		List<String>list=new ArrayList<>();
		
		do{
			nu--;
			String s=Long.toString(nu%26);
			//System.out.print(s);
			list.add(s);
			nu/=26;
		}while(nu>0);
		
	
		for(int i=list.size()-1;i>=0;i--){
			int a=Integer.parseInt(list.get(i));
			//System.out.print(a);
			System.out.print(str.charAt(a));
		}
	}
}