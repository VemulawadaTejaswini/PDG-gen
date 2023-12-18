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
		int num[]=new int[M];
		int sort[]=new int[M];
		int count[]=new int[M];
		for(int i=0;i<M;i++){
			Pi[i]=sc.nextInt();
			Yi[i]=sc.nextInt();
			str1[i] =String.format("%06d",Pi[i]);			
			str2[i] =String.format("%06d",Yi[i]);
			num[i]=Integer.parseInt(str1[i]+str2[i]);
		}
		sort=num.clone();
		Arrays.sort(sort);
		for(int i=0;i<M;i++){  		
			int k=0;
			for(int j=0;j<M;j++) {		
				String s1=Integer.toString(num[i]);
				String s2=Integer.toString(sort[j]);
				int l=s1.length();
				if(s1.substring(0, 5).contains(s2.substring(0, 5))){
					k++;
					if(s1.substring(l-6).contains(s2.substring(l-6))){
						count[i]=k;
					}
				}
			}	
			String str =String.format(str1[i]+"%06d",count[i]); 
			System.out.println(str);
		}
		sc.close();
	}
}