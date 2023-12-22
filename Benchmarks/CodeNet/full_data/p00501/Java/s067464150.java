import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;int cnt = 0;
		String str;
		String name = sc.next();
		for(int k=0;k<n;k++){
			str="";cnt=0;
			str = sc.next();
			for(int i=0;i<str.length();i++){
				for(int j=0;j<name.length();j++){
					if(str.charAt(i+j)!=name.charAt(j)){
						cnt=0;break;
					}
					cnt++;
				}
				if(cnt==name.length())num++;
			}
		}
		System.out.println(num);
	}
}

		