import java.io.*;

class Main{
	public static void Triangle(int[] data){
		int a,b,c,d,e,f;
		a=(int)Math.pow(data[0],2);
		b=(int)Math.pow(data[1],2);
		c=(int)Math.pow(data[2],2);
		d=(int)Math.sqrt(a+b);
		e=(int)Math.sqrt(a+c);
		f=(int)Math.sqrt(b+c);
		if(d==data[2]){
			System.out.printf("YES\n");
		}
		else if(e==data[1]){
			System.out.printf("YES\n");
		}
		else if(f==data[0]){
			System.out.printf("YES\n");
		}
		else{
			System.out.printf("NO\n");
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[3];
		int N,i;
		int Line[]=new int[3];
		i=1;
		N=Integer.parseInt(in.readLine());
		String inputstr;
		while(i<=N){
			inputstr=in.readLine();
			str=inputstr.split(" ",0);
			for(int j=0;j<=2;j++){
				Line[j]=Integer.parseInt(str[j]);
			}
			Triangle(Line);
			i++;
		}
	}
}