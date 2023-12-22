import java.*;
import java.io.*;
import java.util.*; 
 
public class Main
{
	public static void main(String args[]) throws Exception{
		new Main().run();
	}
	
	
	public void run()
	{
		Scanner cin=new Scanner(System.in);
		while(true){
			int a,b;
			a = cin.nextInt();
			b = cin.nextInt();
			if(a==0 && b==0) return;
			int[] taro = new int[a];
			int[] hanako = new int[b];
			int sumt = 0, sumh = 0;
			int i,j;
			for(i=0;i<a;i++){
				sumt += taro[i] = cin.nextInt();
			}
			for(i=0;i<b;i++){
				sumh += hanako[i] = cin.nextInt();
			}
			boolean flag = false;
			for(i=0;i<a;i++){
				for(j=0;j<b;j++){
					if(sumt-sumh==(taro[i]-hanako[j])*2){
						if(!flag){
							flag = true;
							System.out.println(taro[i] + " " + hanako[j]);
						}
					}
				}
			}
			if(!flag) System.out.println(-1);
		}
	}
	
}