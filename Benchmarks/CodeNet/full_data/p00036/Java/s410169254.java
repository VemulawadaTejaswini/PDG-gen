import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	
	int [][] data;
	int [][][] p = {
			{
			{0,1,0,1},
			{0,0,1,1}
			},
			
			{
				{0,0,0,0},
				{0,1,2,3}
			},
			
			{
				{0,1,2,3},
				{0,0,0,0}
				
			},
			
			{
				{0,0,-1,-1},
				{0,1,1,2}
				
			},
			
			{
				{0,1,1,2},
				{0,0,1,1}
				
			},
			
			{
				{0,0,1,1},
				{0,1,1,2}
				
			},
			
			{
				{0,0,1,-1},
				{0,1,0,1}
				
			},
	};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			data = new int[8][8];
			int n = 8;
			for(int i = 0;i < n; i++){
				String input = sc.next();
				for(int j = 0; j < n; j++){
					data[i][j] = input.charAt(j) - '0';
				}
			}
			
			int ind = -1;
			EXIT :
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(data[i][j] == 1){
						
						for(int k = 0; k < p.length; k++){
							boolean res = isOK(i,j,k);
							if(res){
								ind = k;
								break EXIT;
							}
						}
					}
				}
			}
			char ans = (char) (ind + 'A');
			System.out.println(ans);
		}
	}
	
	private boolean isOK(int y, int x, int k) {
		for(int i = 0; i < 4; i++){
			int xx = x + p[k][0][i];
			int yy = y + p[k][1][i];
			if(0<= xx && xx < 8 && 0<= yy && yy<8){
				
			}
			else{
				return false;
			}
			if(data[yy][xx] != 1){
				return false;
			}
		}
		return true;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}