import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int H=s.nextInt();
		int W=s.nextInt();
		String st;
		char c[][]=new char[H+1][W];
		int count=0;
	
		for(int i=0;i<H;i++){
			st=s.nextLine();
			for(int j=0;j<W;j++){
				c[i][j]=st.charAt(j);
			}
		}
		

		for(int i=1;i<H;i++){
			for(int j=1;j<W;j++){
				if(i==1||j==0)continue;
				if(c[i-1][j]==c[i][j]||c[i][j-1]==c[i][j])continue;
				if(i==H-1||j==W-1)continue;
				if(c[i+1][j]==c[i][j]||c[i][j+1]==c[i][j])continue;
				System.out.print("No");
				count++;
				break;
				}
			if(count!=0)break;
			}
		if(count==0)System.out.print("Yes");
		
	
		}

	}


