import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] dice=new int[6];
		int top=1,n=5,w=4,s=2,e=3;
		String[] str=br.readLine().split(" ");//diceの配列に面の値を読み込む
		for(int i=0;i<6;i++){
			dice[i]=Integer.parseInt(str[i]);
		}
		String a=br.readLine();
		char dis[]=a.toCharArray();//読み込んだ方角推移をchar型のdis[]に格納
		for(int i=0;i<a.length();i++){
			switch (dis[i]){
			case 'S':
				{s=top;top=n;n=7-s;break;}
			case 'W':
				{w=top;top=e;e=7-w;break;}
			case 'N':
				{n=top;top=s;s=7-n;break;}
			case 'E':
				{e=top;top=w;w=7-e;break;}
			default:
					System.out.println("その方角は受け入れられません");
			}
		}
		System.out.println(dice[top-1]);
	}
}