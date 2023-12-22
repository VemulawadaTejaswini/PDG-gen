import java.util.*;
public class Main{
	public static void main(String args[]){
		String gara[]={"S","H","C","D"};
		int cards[][]=new int[4][13];
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0;i<n;i++){
			String c=s.next();
			int rank=s.nextInt();
			for(int j=0;j<4;j++){
				if(c.equals(gara[j])){
					cards[j][rank-1]=1;
				}
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(cards[i][j]==0){
					System.out.printf("%s %d\n",gara[i],j+1);
				}
			}
		}
	}
}