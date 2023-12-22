import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int number;
		String[] t;
		double[] n=new double[8];
		String u;
		String[] ans=new String[2];
		double p,q;
		while((s=reader.readLine())!=null){
			number=Integer.parseInt(s);
			for(int k=0;k<number;k++){
				u=reader.readLine();
				t=u.split(" ");
				for(int i=0;i<8;i++){
					n[i]=Double.parseDouble(t[i]);
				}
				p=(n[2]-n[0])*(n[7]-n[5]);
				q=(n[6]-n[4])*(n[3]-n[1]);
				if(p==q){
					ans[k]="YES";
				}else{
					ans[k]="NO";
				}
				System.out.println(ans[k]);
			}
		}
	}
}