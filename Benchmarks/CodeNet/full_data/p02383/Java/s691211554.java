import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int[][] nwse={{5,4,2,3},{1,4,6,3},{1,2,6,5},{1,5,6,2},{1,3,6,4},{2,4,5,3}};
		int[][] nwse={{4,3,1,2},{0,3,5,2},{0,1,5,4},{0,4,5,1},{0,2,5,3},{1,3,4,2}};
		int[] dice=new int[6];
		int top=0;
		String[] str=br.readLine().split(" ");
		for(int i=0;i<6;i++){
			dice[i]=Integer.parseInt(str[i]);
		}
		String a=br.readLine();
		char dis[]=a.toCharArray();//読み込んだ方角推移をchar型のdis[]に格納
		for(int i=0;i<a.length();i++){
			switch (dis[i]){
			case 'S':
				{top=nwse[top][0];break;}
			case 'W':
				{top=nwse[top][1];break;}
			case 'N':
				{top=nwse[top][2];break;}
			case 'E':
				{top=nwse[top][3];break;}
			default:
					System.out.println("その方角は受け入れられません");
			}
		}
		System.out.println(dice[top]);
	}
}