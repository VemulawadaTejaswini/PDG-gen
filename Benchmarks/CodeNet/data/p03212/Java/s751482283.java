import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int[] num=new int[10];
		Arrays.fill(num,  -1);
		long sum=0;
		int count=0;
		int i=0;
		num[i]=0;
		boolean b3=false,b5=false,b7=false;
		while (sum<=n) {
			sum=0;
			for(int j=0;j<10;++j) {
				if(num[j]==3) {num[j]=0; ++num[j+1];}
				
				
				if(num[j]==0)sum=sum+3*(long)Math.pow(10, j);
				else if(num[j]==1)sum=sum+5*(long)Math.pow(10, j);
				else if(num[j]==2)sum=sum+7*(long)Math.pow(10, j);
				
			}

			if(sum<=n) {
				for(int j=0;j<10;++j) {
					if(num[j]==0)b3=true;
					if(num[j]==1)b5=true;
					if(num[j]==2)b7=true;
				}
				if(b3==true&&b5==true&&b7==true)++count;
			}
			b3=false;b5=false;b7=false;
			++num[0];
		}
		System.out.println(count);
	}
}
