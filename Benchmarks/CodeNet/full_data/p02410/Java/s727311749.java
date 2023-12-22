import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,m,i,j,h,k;
        n = input.nextInt();
		m = input.nextInt();
        int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		for(i=0;i<n;i++) {
        for (j=0;j<m;j++){
            h=input.nextInt();
            a[i][j]=h;
            }
		}
        for(j=0;j<m;j++){
            k=input.nextInt();
            b[j]=k;
        }
        for (i=0;i<n;i++) {
            c[i]=0;
        for(j=0;j<m;j++){
            c[i]+=a[i][j]*b[j];
            }
        }
        for (i=0;i<n;i++){
            System.out.println(c[i]);
        }
    }
}
