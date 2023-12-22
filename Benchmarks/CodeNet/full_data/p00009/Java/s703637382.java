import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		boolean[] number=new boolean[1000000];
		number[0]=false;
		number[1]=false;
		for(int i=2;i<1000000;i++){
			number[i]=true;
		}
		while(true){
			String s=r.readLine();
			int n=Integer.parseInt(s);
			int count=0;
			for(int j=0;j<=n;j++){
				if(number[j]==true){
					count++;
					for(int k=j;k<=n;k+=j){
						number[k]=false;
					}
				}
			}
			System.out.println(count);
			for(int l=2;l<1000000;l++){
				number[l]=true;
			}
		}
	}
}