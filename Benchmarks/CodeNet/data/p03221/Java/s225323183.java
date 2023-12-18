import java.util.Scanner;

public class Main {
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] City=new int[M][2];
		int [] tag;
		
		for(int i=0;i<M;i++) {
			City[i][0]=sc.nextInt();
			City[i][1]=sc.nextInt();
		}
		
		sc.close();
		int k=1;
		
		while(k<=N){
			int j=0;
			tag=new int [M];
			for(int i=0;i<M;i++) {
				if(City[i][0]==k) {
					tag[j]=City[i][1];
					j=j+1;
				}
			}
			
			for(int x=0;x<j-1;x++) {
				for(int y=x+1;y<j;y++) {
					if(tag[x]>tag[y]) {
						int z=0;
						z=tag[x];
						tag[x]=tag[y];
						tag[y]=z;
					}
				}
			}
			
			for(int i=0;i<M;i++) {
				if(City[i][0]==k) {
					for(int x=0;x<j;x++) {
						if(City[i][1]==tag[x]) {
							City[i][1]=x+1;
						}
					}
				}
			}
			k=k+1;
		}
		

		for(int i=0;i<M;i++) {
			int x=City[i][0];
			int y=City[i][1];
			
			String str1=x+"";
			String str2=y+"";
			
			int l1 =str1.length();
			int l2 =str2.length();
			
			String string1="";
			String string2="";
			for(int l=0;l<6-l1;l++) {
				string1=string1+"0";
			}
			for(int l=0;l<6-l2;l++) {
				string2=string2+"0";
			}
			
			string1=string1+str1;
			string2=string2+str2;
	
			System.out.println(string1+string2);
		}

	}

}
