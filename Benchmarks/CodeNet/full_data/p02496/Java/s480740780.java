import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String t;
		String[] u;
		int n;
		int[] Scard=new int[14];
		int[] Dcard=new int[14];
		int[] Hcard=new int[14];
		int[] Kcard=new int[14];
		for(int p=0;p<14;p++){
			Scard[p]=0;
			Dcard[p]=0;
			Hcard[p]=0;
			Kcard[p]=0;
		}
		Scard[0]=1;
		Dcard[0]=1;
		Hcard[0]=1;
		Kcard[0]=1;
		while((s=r.readLine())!=null){
			t=r.readLine();
			u=t.split(" ");
			n=Integer.parseInt(u[1]);
			for(int g=0;g<n;g++){
				if(u[0].equals("S")){
					Scard[n]=1;
					System.out.println("now Sscanning...");
				}else if(u[0].equals("D")){
					Dcard[n]=1;
					System.out.println("now Dscanning...");
				}else if(u[0].equals("H")){
					Hcard[n]=1;
					System.out.println("now Hscanning...");
				}else if(u[0].equals("K")){
					Kcard[n]=1;
					System.out.println("now Kscanning...");
				}
			}
			System.out.println("now printing...");
			for(int a=1;a<14;a++){
				if(Scard[a]==0){
					System.out.println("S "+a);
				}
			}
			for(int b=1;b<14;b++){
				if(Hcard[b]==0){
					System.out.println("H "+b);
				}
			}
			for(int c=1;c<14;c++){
				if(Kcard[c]==0){
					System.out.println("C "+c);
				}
			}
			for(int d=1;d<14;d++){
				if(Dcard[d]==0){
					System.out.println("D "+d);
				}
			}
		}
	}
}