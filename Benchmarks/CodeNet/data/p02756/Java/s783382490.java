import java.util.*;
public class Main {
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			String s = sc.next();
			String ss="";
			int o=sc.nextInt();
			while(o-->0){
				int n=sc.nextInt();
				if(n==1){
					for(int i=s.length()-1;i>=0;i--){
						ss+=s.charAt(i);
					}
					s = ss;
					ss = "";
				}else{
					int a = sc.nextInt();
					String x = sc.next();
					if(a==1){
						s=x+s;
					}else{
						s +=x;
					}
				}
			}
			System.out.println(s);
	}
}