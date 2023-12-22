import java.util.Scanner;
 class afa {


static int pri[] = new int[1000000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getnums();
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int a=cin.nextInt();
			System.out.println(pri[a]);
		}
		

	}

	private static void getnums() {
		// TODO Auto-generated method stub
		pri[1]=0;
		pri[2]=1;
		for(int i=2;i<1000000;i++)
		{
			if(pri[i]==-1)
			{
				pri[i]=pri[i-1];
				continue;
			}
			pri[i]=pri[i-1]+1;
			for(int j=i+i;j<1000000;j+=i)
			{
				pri[j]=-1;
			}
				
		}
		
	}

}