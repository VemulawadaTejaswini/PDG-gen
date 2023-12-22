import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Integer> ans=new ArrayList<>();
	int n=sc.nextInt();
	int y[]=new int[n];
	int m[]=new int[n];
	int d[]=new int[n];
	int i;
	int count=0;


		for(i=0;i<n;i++) {
			y[i]=sc.nextInt();
			m[i]=sc.nextInt();
			d[i]=sc.nextInt();

			int f=1000-y[i];
			int e=f/3;

			if(f%3==0) {
				if(m[i]%2==1)
					count+=20-d[i];
				else
					count+=19-d[i];
				count+=20*((10-m[i])/2)+19*((10-m[i])-(10-m[i])/2);

				count+=200*e+195*(f-e-1);
			}
			else if(f%3==1) {
				count+=20-d[i];
				count+=20*(10-m[i]);

				count+=200*e+195*(f-e-1);
			}

			else if(f%3==2) {
				if(m[i]%2==1)
					count+=20-d[i];
				else
					count+=19-d[i];
				count+=20*((10-m[i])/2)+19*((10-m[i])-(10-m[i])/2);

				count+=200*(e+1)+195*(f-(e+1)-1);
			}
			ans.add(count+1);
			count=0;
		}
		for(i=0;i<n;i++)
			System.out.println(ans.get(i));
	}
}

