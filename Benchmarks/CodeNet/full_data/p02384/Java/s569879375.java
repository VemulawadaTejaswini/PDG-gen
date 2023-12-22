import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][] nwse={{0,0,0,0,0},{1,5,4,2,3,5},{2,1,4,6,3,1},{3,1,2,6,5,1},{4,1,5,6,2,1},{5,1,3,6,4,1},{6,2,4,5,3,2}};
        int[] dice=new int[6];
        int top=0;
        String[] str=br.readLine().split(" ");
        for(int i=0;i<6;i++){
            dice[i]=Integer.parseInt(str[i]);
        }
        int t,s,e;
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
        	str=br.readLine().split(" ");
        	t=Integer.parseInt(str[0]);
        	s=Integer.parseInt(str[1]);
        	for(int j=1;j<=4;j++){
        		if(nwse[t][j]==s) {
        			e=nwse[t][j+1];
        			System.out.println(e);
        		}
        	}
        }
	}
}