import java.util.*;
import java.io.PrintWriter;

public class Main{
	static int[] c=new int[26];
	static int[] lastD=new int[26];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		for(int i=0; i<26; i++){
			c[i]=sc.nextInt();
		}
		int[][] s=new int[d][26];
		for(int i=0; i<d; i++){
			for(int j=0; j<26; j++){
				s[i][j]=sc.nextInt();
			}
		}
		int maxSati=-1;
		int maxInd=-1;
		//j:何日目
		for(int j=0; j<d; j++){
			//i:どの大会をやるか
			for(int i=1; i<=26; i++){
				int sati=0;
				lastD[i-1]=j+1;
				sati+=s[j][i-1];
				sati-=subSati(j+1);
				lastD[i-1]=0;
				if(maxSati<sati){
					maxSati=sati;
					maxInd=i;
				}
			}
			System.out.println(maxInd);
			lastD[maxInd-1]=j+1;
			maxSati=-1;
			maxInd=-1;
		}
	}
	static int subSati(int d){
		int ret=0;
		for(int i=0; i<26; i++){
			ret+=c[i]*(d-lastD[i]);
		}
		return ret;
	}
}
