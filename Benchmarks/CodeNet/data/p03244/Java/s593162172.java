import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int v=0;
		int v1=0;
		int v2=0;
		int odd[][]=new int[100001][2];
		int even[][]=new int[100001][2];
		int z=0,y=0,x=0,cou=0;
		while(z<n){
			v=stdIn.nextInt();
			if(z==0)
				v1=v;
			if(z==1)
				v2=v;
			if(z%2==0){
				odd[v][0]++;
				odd[v][1]=v;
				x++;
			}
			else{
				even[v][0]++;
				even[v][1]=v;
				y++;
			}
			z++;
		}z=0;
		Arrays.sort(odd, (a, b) -> Long.compare(a[0], b[0]));
		Arrays.sort(even, (a, b) -> Long.compare(a[0], b[0]));
		if(x!=odd[100000][0]){
			cou+=x-odd[100000][0];
		}
		if(y!=even[100000][0]){
			cou+=y-even[100000][0];
		}
		if(x!=odd[100000][0]&&y!=even[100000][0]){
			if(even[100000][1]==odd[100000][1])
				if(odd[100000][0]-odd[99999][0]>=even[100000][0]-even[99999][0])
					cou+=odd[100000][0]-odd[99999][0];
				else
					cou+=even[100000][0]-even[99999][0];
		}
		if(x==odd[100000][0]&&y==even[100000][0]){
			if(v1==v2)
				cou+=y;
		}
		System.out.println(cou);
	}
}