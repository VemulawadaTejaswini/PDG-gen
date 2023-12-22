import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			String s;
			while((s=reader.readLine()) !=null){
				String[] t=s.split(" ");
				int sum=0;
				int[] r=new int[2];
				int n=1;
				for(int i=0;i<2;i++){
					r[i]=Integer.parseInt(t[i]);
					sum += r[i];
				}
				for(int j=0;sum/10 !=0;j++){
					sum =sum/10;
					n +=1;
				}
				System.out.println(n);
			}
		}catch(IOException e){
			System.exit(0);
		}
	}
}