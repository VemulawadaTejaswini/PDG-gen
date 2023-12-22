package volume00;
import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		try{
			flag: while((s=br.readLine())!=null){
				String[] str=s.split(" ");
				int[] data=new int[3];
				for(int i=0;i<3;i++){
					data[i]=Integer.parseInt(str[i]);
				}
				for(int i=0;i<3;i++){
					if(Math.pow(data[i%3],2)+Math.pow(data[(i+1)%3],2)==Math.pow(data[(i+2)%3],2)){
						System.out.println("Yes");
						continue flag;
					}
				}
				System.out.println("No");
			}
		}catch(Exception e){
			System.out.println("Done.");
		}
	}
}