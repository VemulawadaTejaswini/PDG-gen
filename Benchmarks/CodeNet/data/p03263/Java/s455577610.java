import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[][] pos = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				pos[i][j] = sc.nextInt();
			}
		}
		int amari = 0;
		int ax=0,ay=0;
		int ansN = 0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(pos[i][j]%2 == 1){
					if(amari==0){
						amari++;
						ax=i;
						ay=j;
					}else{
						int ii = i;
						int jj = j;
						while(ii != ax){
							ans.add(ii);ans.add(jj);ans.add(ii-1);ans.add(jj);
							ii--;
							ansN++;
						}
						while(jj != ay){
							if(ay<jj){
								ans.add(ii);ans.add(jj);ans.add(ii);ans.add(jj-1);
								jj--;
							}else{
								ans.add(ii);ans.add(jj);ans.add(ii);ans.add(jj+1);
								jj++;
							}
							ansN++;
						}
						amari=0;
					}
					
				}
			}
		}
		System.out.println(ansN);
		for(int i=0;i<ansN;i++){
			System.out.println(ans.get(i*4)+" "+ans.get(i*4+1)+" "+ans.get(i*4+2)+" "+ans.get(i*4+3));
		}
		
;	}
}
