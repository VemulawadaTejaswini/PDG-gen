import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=s.toCharArray();
		int count1=0;
		int count2=0;
		for(int i=0;i<c.length;i++){
			if((i%2==0&&c[i]=='0')||(i%2!=0&&c[i]=='1'))
				count1++;
			if((i%2==0&&c[i]=='1')||(i%2!=0&&c[i]=='0'))
				count2++;
		}
		System.out.println(count1<count2?count1:count2);		
	}
	
}