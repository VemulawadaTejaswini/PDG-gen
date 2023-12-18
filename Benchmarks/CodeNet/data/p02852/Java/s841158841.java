
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		String str=sc.next();
		char[] tmparray=str.toCharArray();
		char[] c=new char[n+1];
		
		for(int i=0;i<tmparray.length;i++){
			c[i]=tmparray[n-i];
		}
		
		LinkedList<Character> clist=new LinkedList();
		
		int c1=0;
		
		String ans="-1";
		
		//Case unsolvable
		for(char ch:c){
			if(ch=='1'){
				c1++;
				if(c1>=m){
					System.out.println(ans);
					System.exit(0);
				}
			}else{
				c1=0;
				clist.add(ch);
			}
		}
		
		//case solvable
		
		ans="";
		int index=0;
		for(int i=m;i>0;i--){
			if((index+i)==c.length-1){
				ans=i+" "+ans;
				break;
			}else if((index+i)>=c.length){
				continue;
			}
			if(c[index+i]=='1'){
				continue;
			}else{
				if(ans=="")ans=i+ans;
				else ans=i+" "+ans;
				index=index+i;
				i=m+1;
			}
		}
		
		System.out.println(ans);
		}
		
	
}

