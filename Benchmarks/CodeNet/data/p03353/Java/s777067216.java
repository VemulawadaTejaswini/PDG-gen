import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int K=sc.nextInt();
		int place=0;
		String tempre="z";
		String ans="null";

		for(int i=0;i<str.length();i++){
			char tmp=str.charAt(i);
			String tmp2=String.valueOf(tmp);
			if(tmp2.compareTo(tempre)<0){
				tempre=tmp2;
				place=i;
			}
		}

		ans=str.substring(place,place+K-1);

		System.out.println(ans);
	}
}