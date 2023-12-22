import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,p,bowl,i,ans;
		int mayor[];
		boolean flag;
		while(true){
			n=sc.nextInt();
			p=sc.nextInt();
			bowl=p;
			ans=-1;
			flag=false;
			if(n+p==0) break;
			mayor=new int[n];
			Arrays.fill(mayor, 0);

			while(true){
				for(i=0;i<n;i++){
					if(bowl==0){
						bowl=mayor[i];
						mayor[i]=0;
					}
					else{
						mayor[i]+=1;
						bowl--;
						if(mayor[i]==p){
							//finish
							ans=i;
							flag=true;
							break;
						}
					}
				}
				if(flag) break;
			}
			System.out.println(ans);
		}
	}

}