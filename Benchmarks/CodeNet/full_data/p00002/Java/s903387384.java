import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		int a,b,sum,digits;
		int i=1;
		String str;
		String num[]=new String[2];
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		while(i<=200){
			if((str=in.readLine())==null)
				break;
			digits=1;
			num=str.split(" ",0);
			a=Integer.parseInt(num[0]);
			b=Integer.parseInt(num[1]);
			sum=a+b;
			while((sum=sum/10)!=0)
				digits++;
			System.out.printf(digits+"\n");
			i++;
		}
	}

}