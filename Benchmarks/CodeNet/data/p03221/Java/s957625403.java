import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Pi[]=new int[M];
		int Yi[]=new int[M];
		String str1[]=new String[M];
		String str2[]=new String[M];
		long num[]=new long[M];
		long sort[]=new long[M];
		int count[]=new int[M];
		for(int i=0;i<M;i++){
			Pi[i]=sc.nextInt();
			Yi[i]=sc.nextInt();
			str1[i] =String.format("%06d",Pi[i]);			
			str2[i] =String.format("%010d",Yi[i]);
			num[i]=Long.parseLong(str1[i]+str2[i]);
		}
		sort=num.clone();
		Arrays.sort(sort);
		for(int i=0;i<M;i++){  		
			int k=0;
			for(int j=0;j<M;j++) {		
				String s1=Long.toString(num[i]);
				String s2=Long.toString(sort[j]);
				int l=s1.length();
				if(Integer.parseInt(s1.substring(0, l-10))==Integer.parseInt(s2.substring(0, l-10))){
					k++;
					if(Long.parseLong(s1.substring(l-10))==Long.parseLong(s2.substring(l-10))){
						count[i]=k;
						break;
					}
				}
			}	
			String str =String.format(str1[i]+"%06d",count[i]); 
			System.out.println(str);
		}
		sc.close();
	}
}