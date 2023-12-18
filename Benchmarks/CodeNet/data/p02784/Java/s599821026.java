import java.util.*;
public class jan2602{
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			int h,n,c=0;
			h=sc.nextInt();
			n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			if(h<=0 || h>=10001)
			{
			 	System.out.println("EXit.....");
			 	System.exit(0);
			}

			for(int j=0;j<n;j++){
				if(a[j]<=0 || a[j]>=10001){
					System.out.println("EXit.....");
					System.exit(0);}
			}

			for(int i=0;i<n;i++)
				c+=a[i];

					if(c<=0)
					{
						System.out.println(c);
						System.exit(0);
					}
					else{
						h=h-c;
						if(h<=0)
							System.out.println("YES");
						else
							System.out.println("NO");
					}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
}