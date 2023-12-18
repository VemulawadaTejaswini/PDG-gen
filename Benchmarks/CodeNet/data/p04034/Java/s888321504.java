import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[] num=new int[n]; Arrays.fill(num,1);
			boolean[] red=new boolean[n]; Arrays.fill(red,false);
			red[0]=true;
			for(int i=0;i<m;i++){
				int x=sc.nextInt(); x--;
				int y=sc.nextInt(); y--;
				if(red[x]){
					if(num[x]==1){
						num[x]--; num[y]++;
						red[x]=false; red[y]=true;
					}
					else{
						num[x]--; num[y]++;
						red[y]=true;
					}
				}
				else{
					num[x]--;  num[y]++;
				}
			}
			int ans=0;
			for(int i=0;i<n;i++) if(red[i]) ans++;
			System.out.println(ans);
		}
	}
}