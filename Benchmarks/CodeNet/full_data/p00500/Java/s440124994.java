import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] point=new int[200][200];
		int[] point2=new int[200];
		int n=sc.nextInt();
		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
			    point[j][i]=sc.nextInt();
			}
		}
		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
			    point2[j]=0;
			    for(int k=1;k<=n;k++){
			    	if(point[j][i]==point[k][i] && j!=k) point2[j]+=1;
			    }
			}
		}
		for(int j=1;j<=n;j++){
			System.out.print(point2[j]);
			if(j!=n) System.out.print(" ");
			else System.out.println("");
			}
	}
}