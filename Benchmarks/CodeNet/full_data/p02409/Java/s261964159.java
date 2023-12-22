import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[4];
		int n;
		int b;
		int f;
		int r;
		int v;
		
		int[][] one=new int[3][10];
		int[][] two=new int[3][10];
		int[][] three=new int[3][10];
		int[][] four=new int[3][10];
		
		//初期化
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				one[i][j]=0;
			}
		}
		for(int i=0; i<two.length; i++) {
			for(int j=0; j<two[0].length; j++) {
				two[i][j]=0;
			}
		}
		for(int i=0; i<three.length; i++) {
			for(int j=0; j<three[0].length; j++) {
				three[i][j]=0;
			}
		}
		for(int i=0; i<four.length; i++) {
			for(int j=0; j<four[0].length; j++) {
				four[i][j]=0;
			}
		}
		
		//入力
		try {
			n=Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				work=br.readLine().split("\\s+");
				b=Integer.parseInt(work[0]);
				f=Integer.parseInt(work[1]);
				r=Integer.parseInt(work[2]);
				v=Integer.parseInt(work[3]);
				
				switch(b) {
				case 1:
					one[f-1][r-1]+=v;
					checkpersons(one,f,r);
					break;
				case 2:
					two[f-1][r-1]+=v;
					checkpersons(two,f,r);
					break;
				case 3:
					three[f-1][r-1]+=v;
					checkpersons(three,f,r);
					break;
				case 4:
					four[f-1][r-1]+=v;
					checkpersons(four,f,r);
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//出力
		printroom(one);
		sb.append("####################");
		sb.append(String.format("%n", ""));
		printroom(two);
		sb.append("####################");
		sb.append(String.format("%n", ""));
		printroom(three);
		sb.append("####################");
		sb.append(String.format("%n", ""));
		printroom(four);
		System.out.print(sb);
		sb.append(String.format("%n", ""));
	}
	
	public static void checkpersons(int[][] checkFloor, int f, int r) {
		if(checkFloor[f-1][r-1]<0){checkFloor[f-1][r-1]=0;}
		if(checkFloor[f-1][r-1]>9){checkFloor[f-1][r-1]=9;}
	}
	
	public static void printroom(int prt[][]) {
		for(int[] temp:prt) {
			int cnt=0;
			for(int temp2:temp) {
				sb.append(" ");
				sb.append(temp2);
				cnt++;
				if(cnt%10==0) {
					cnt=0;
					sb.append(String.format("%n", ""));
				}
			}
		}
	}

}
