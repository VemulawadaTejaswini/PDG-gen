import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		int[] count = new int[26];
		int flag=0;
		long ans =0;
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		long sum =0;
		for(int i=0;i<s.length();i++) {
			int count1 =1;
			int flag1 =0;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(j)!=s.charAt(i)) {
					i=j-1;
				     break;
				}
				if(s.charAt(j)==s.charAt(i) && j==s.length()-1){
					flag1=1;
				}
				count1++;
			}
			
		//	System.out.println(count1);
			sum=sum+(count1/2);
		//	System.out.println(sum);
			if(flag==1) {
				break;
			}
		}
		if(s.charAt(s.length()-1)!=s.charAt(s.length()-2) && s.charAt(0)==s.charAt(s.length()-1)) {
			flag=1;
		}
		if(flag ==0) {
			sum = (sum)*k;
			System.out.println(sum);
		}
		else {
			sum = sum*k;
			System.out.println(sum+k-1);
		}	
	}
}
