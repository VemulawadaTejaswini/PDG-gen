import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int k=sc.nextInt();
		char[][] map=new char[h][w];
		boolean[] sp=new boolean[h];
		for(int i=0; i<h; i++){
			String s=sc.next();
			for(int j=0; j<w; j++){
				map[i][j]=s.charAt(j);
				if(map[i][j]=='#'){
					sp[i]=true;
				}
			}
		}
		int[][] ans=new int[h][w];
		int num=1;
		int count=0;
		int kk=0;
		for(int i=0; i<h; i++){
			if(!sp[i]){
				continue;
			}else{
				kk=i;
			}
			for(int j=0; j<w; j++){
				if(map[i][j]=='#'){
					count++;
					if(count>1){
						num++;
					}
				}
				ans[i][j]=num;
			}
			count=0;
			num++;
		}
		int up=kk+1;
		while(up<h){
			if(!sp[up]){
				for(int i=0; i<w; i++){
					ans[up][i]=ans[up-1][i];
				}
			}
			up++;
		}
		int down=kk-1;
		while(down>-1){
			if(!sp[down]){
				for(int i=0; i<w; i++){
					ans[down][i]=ans[down+1][i];
				}
			}
			down--;
		}
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
