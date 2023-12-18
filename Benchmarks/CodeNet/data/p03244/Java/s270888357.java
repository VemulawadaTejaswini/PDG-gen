import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int v=0;
		int v1=0;
		int v2=0;
		int odd[]=new int[100001];
		int even[]=new int[100001];
		int z=0,y=0,x=0,cou=0;
		while(z<n){
			v=stdIn.nextInt();
			if(z==0)
				v1=v;
			if(z==1)
				v2=v;
			if(z%2==0){
				odd[v]++;
				x++;
			}
			else{
				even[v]++;
				y++;
			}
			z++;
		}z=0;
		Arrays.sort(odd);
		Arrays.sort(even);
		if(x!=odd[100000]){
			cou+=x-odd[100000];
		}
		if(y!=even[100000]){
			cou+=y-even[100000];
		}
		if(x==odd[100000]&&y==even[100000]){
			if(v1==v2)
				cou+=y;
		}
		System.out.println(cou);
	}
}
