import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int[] in=new int[3];
		for(int i=0;i<3;i++){
		in[i]=Integer.parseInt(st[i]);}
		for(int i=0;i<2;i++){
			for(int j=i+1;j<3;j++){				
				if(in[i]>in[j]){int tmp=in[i];
					in[i]=in[j];
					in[j]=tmp;
				}
			}
		}System.out.println(in[0]+" "+in[1]+" "+in[2]);
	}}