import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		
		int n=sc.nextInt();
		int []p =new int [n*2];
		int []now=new int [2];
		System.out.printf("%d\n",n);
		for(i=0;i<n*2;i+=2){
			int hp  =sc.nextInt();
			p[i]=hp;
			int wp =sc.nextInt();
			p[i+1]=wp;
			System.out.printf("%d\n",p[i]);
			System.out.printf("%d\n",p[i+1]);
		}
		
		int [] nex=new int [2];
		now[0]=p[0];
		now[1]=p[1];
		
		while(c!=0 && (now[0]==p[n*2-2] && now[1]==p[n*2-1])){
			if(p[c]-now[0]>0) nex[0]=1;
			else if(p[c]-now[0]==0) nex[0]=0;
			else if(p[c]-now[0]<1) nex[0]=-1;
			
			if(p[i+1]-now[1]>0) nex[1]=1;
			else if(p[c+1]-now[1]==0) nex[1]=0;
			else if(p[c+1]-now[1]<1) nex[1]=-1;
			
			if(nex[0]== 1 && nex[1] == -1) nex[0]=0;
			else if(nex[0]== -1 && nex[1] == 1) nex[0]=0;
			
			now[0]=now[0]+nex[0];
			now[1]=now[1]+nex[1];
			
			System.out.printf("h %d\n",now[0]);
			System.out.printf("w %d\n",now[1]);
			System.out.printf("n %d\n",c);
			c+=2;
		}
		
		
		System.out.printf("%d\n",c);
		sc.close();
		System.exit(0);
	}
}