import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Scanner reader=new Scanner(System.in);
		String s;//=reader.readLine();
		//int in=reader.nextInt();
		int[][] out=new int[10][10];
		while((s=reader.readLine())!=null){
			String tmp[]=s.split(",");
			int[] in=new int[3];
			for(int i=0;i<3;i++)in[i]=Integer.parseInt(tmp[i]);
			if(in[2]==1){
				for(int i=-1;i<2;i++){
					for(int j=-1;j<2;j++){
						if(i+j<-1||i+j>1||in[0]+i<0||in[0]+i>9||in[1]+j<0||in[1]+j>9)continue;
						out[in[0]+i][in[1]+j]++;
					}
				}
			}else if(in[2]==2){
				for(int i=-1;i<2;i++){
					for(int j=-1;j<2;j++){
					if(in[0]+i<0||in[0]+i>9||in[1]+j<0||in[1]+j>9)continue;
						out[in[0]+i][in[1]+j]++;
					}
				}
			}else if(in[2]==3){
				for(int i=-2;i<3;i++){
					for(int j=-2;j<3;j++){
						if(i+j<-2||i+j>2||in[0]+i<0||in[0]+i>9||in[1]+j<0||in[1]+j>9)continue;
						if((j==-2||i==2)&&(i!=0&&j!=0))continue;
						if((i==-2||j==2)&&(i!=0&&j!=0))continue;
						
						out[in[0]+i][in[1]+j]++;
					}
				}
			}
		}
		int co1=0,co2=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(out[i][j]==0)co1++;
				if(out[i][j]>co2)co2=out[i][j];
			}
		}
		System.out.println(co1);
		System.out.println(co2);
	}
}