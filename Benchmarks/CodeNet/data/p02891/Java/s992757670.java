import java.util.*;
public class Main{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		//sb.append(str);
		while(k--!=0) {
			sb.append(str);
		}
		System.out.print(sb);
        long c=0;
		for(int i=1;i<sb.length();i++) {
			if(sb.charAt(i)==sb.charAt(i-1)) {
				c++;
				//sb.insert(i, '#');
				sb.setCharAt(i, '#');
			}
		}
		System.out.println(c);
	}
}