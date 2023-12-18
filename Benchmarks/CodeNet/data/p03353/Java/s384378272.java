import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char[] sa=s.toCharArray();
		int K = sc.nextInt();
		
		List<String> list=new ArrayList<>();
		
		char minChar0='z';
		for(int i=0;i<sa.length;i++){
			minChar0=(char)Math.min(minChar0, sa[i]);
		}
		for(int i=0;i<s.length();i++){
			if(sa[i]!=minChar0)continue;
			for(int j=1;j<=5;j++){
				if(i+j>s.length())break;
				if(!list.contains(s.substring(i,i+j))){
					list.add(s.substring(i,i+j));
				}
			}
		}
		char minChar1='z';
		if(list.size()<K){
			for(int i=0;i<sa.length;i++){
				if(sa[i]==minChar0)continue;
				minChar1=(char)Math.min(minChar1, sa[i]);
			}
			for(int i=0;i<s.length();i++){
				if(sa[i]!=minChar1)continue;
				for(int j=1;j<=5;j++){
					if(i+j>s.length())break;
					if(!list.contains(s.substring(i,i+j))){
						list.add(s.substring(i,i+j));
					}
				}
			}
		}
		if(list.size()<K){
			char minChar2='z';
			for(int i=0;i<sa.length;i++){
				if(sa[i]==minChar0||sa[i]==minChar1)continue;
				minChar2=(char)Math.min(minChar2, sa[i]);
			}
			for(int i=0;i<s.length();i++){
				if(sa[i]!=minChar2)continue;
				for(int j=1;j<=5;j++){
					if(i+j>s.length())break;
					if(!list.contains(s.substring(i,i+j))){
						list.add(s.substring(i,i+j));
					}
				}
			}
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(K-1));
	}

	public static int gcd(int a, int b) {
		return a%b==0 ? b : gcd(b,a%b);
	}
}
