import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] point=new int[200][200];
		int[] point2=new int[200];
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++) point2[i]=0;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
			    point[j][i]=sc.nextInt();
			}
		}
		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
			    for(int k=1;k<=n;k++){
			    	if(point[j][i]==point[k][i] && j!=k) s+=1;
			    	if(s==n-1) point2[j]=point2[j]+point[j][i];
			    }
			    s=0;
			}
		}
		for(int j=1;j<=n;j++){
			System.out.print(point2[j]);
			if(j!=n) System.out.print(" ");
			else System.out.println("");
		}
	}
}