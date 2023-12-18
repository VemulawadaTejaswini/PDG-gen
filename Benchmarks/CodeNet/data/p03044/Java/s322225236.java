import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] edge = new int [2][n-1]; 
		int[] len = new int [n-1];
		for(int i = 0; i < n-1; i++) {
			edge[0][i] = sc.nextInt()-1;
			edge[1][i] = sc.nextInt()-1;
			len[i] = sc.nextInt();
		}
		int[] col = new int[n];
		for(int i = 0; i < n; i++) {
			col[i] = -1;
		}
		for(int i = 0; i < n-1; i++) {
			if(len[i]%2==0) {
				if(col[edge[0][i]]==-1&&col[edge[1][i]]==-1) {
					col[edge[0][i]]=0;
					col[edge[1][i]]=0;
				}
				else if(col[edge[0][i]]!=-1&&col[edge[1][i]]==-1) {
					col[edge[1][i]]=col[edge[0][i]];
				}
				else if(col[edge[0][i]]!=-1&&col[edge[1][i]]==-1) {
					col[edge[1][i]]=col[edge[0][i]];
				}
				else if(col[edge[0][i]]==-1&&col[edge[1][i]]!=-1) {
					col[edge[0][i]]=col[edge[1][i]];
				}
				else {
					continue;
				}
			}
		}
		for(int i=0; i < n; i++) {
			if(col[i] == -1) {
				col[i] = 1;
			}
			System.out.println(col[i]);
		}
	}
}