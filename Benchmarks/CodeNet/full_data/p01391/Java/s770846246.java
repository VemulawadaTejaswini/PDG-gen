import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int p[][]=new int[b][a/2];
		for(int i=0;i<b;i++){
			for(int j=0;j<a/2;j++)p[i][j]=s.nextInt();
		}
		while(true){
			int al[]=new int[a];
			for(int i=0;i<a;i++)al[i]=(int)(Math.random()*2);
			boolean chad=false;
			for(int i=0;i<b;i++){
				int roy=0;
				for(int j=0;j<a/2;j++)roy+=al[p[i][j]-1];
				if(a/8<=roy&&a/8*3>=roy);
				else chad=true;
			}
			if(!chad){
				for(int i=0;i<a;i++)System.out.print(al[i]);
				System.out.println();
				System.exit(0);
			}
		}
	}
}