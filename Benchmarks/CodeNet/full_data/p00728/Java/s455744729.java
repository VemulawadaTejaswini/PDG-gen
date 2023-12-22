import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n=0;
		int count = 0;
		while(count<20){
			n=stdIn.nextInt();
			if(n>=3&&n<=100) break;
			count++;
		}
		int[] s=new int[n];
		for(int i=0;i<s.length;i++){
			while(count<20){
				s[i]=stdIn.nextInt();
				if(s[i]>=0&&s[i]<=1000) break;
				count++;
			}

		}

		int max = s[0];
		int min = s[0];
		int a=0;
		int b=0;
		for(int i=1;i<s.length;i++){
			if(s[i]>max){
				max = s[i];
				a=i;
			}
			if(s[i]<min){
				min = s[i];
				b=i;
			}
		}
		s[a]=0;
		s[b]=0;
		int all = 0;
		for(int i=0;i<s.length;i++){
			all += s[i];
		}
		int ave = all/(n-2);

		System.out.println(0);
		System.out.println(ave);
	}

}