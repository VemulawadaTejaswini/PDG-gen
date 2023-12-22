import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException  {
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		String n=a.readLine();
		int s=Integer.parseInt(n);
		int[] k;k=new int[s];
		for(int z=0;z<=s;z++){
			String x=a.readLine();
			String[] i=x.split(" ");
			if (i[0]=="S"){k[Integer.parseInt(i[1])]=1;}
			else if(i[0]=="H"){k[Integer.parseInt(i[1])+13]=1;}
			else if(i[0]=="C"){k[Integer.parseInt(i[1])+26]=1;}
			else if(i[0]=="D"){k[Integer.parseInt(i[1])+39]=1;}
			}
		int m=52-s;int c=0;
		for(int z=0;z<=s;z++){
			if(k[z]!=1){int e=z/13;int f=z%13;
			switch (e){
			case 0:
				System.out.println("S "+f);break;
			case 1:
				System.out.println("H "+f);break;
			case 2:
				System.out.println("C "+f);break;
			case 3:
				System.out.println("D "+f);break;
				}
			c++;
			if(m==c)break;
			}
		}
	}
}