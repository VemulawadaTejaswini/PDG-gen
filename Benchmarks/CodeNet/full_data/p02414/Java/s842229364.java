import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int l=sc.nextInt();
int [][]a=new int [n][m];
int [][]b=new int [m][l];
long [][]c=new long [n][l];
for(int i=0;i<n;i++) {
	for(int o=0;o<m;o++) {
		int s=sc.nextInt();
		a[i][o]=s;
	}
}
for(int p=0;p<m;p++) {
	for(int u=0;u<l;u++) {
		int d=sc.nextInt();
		b[p][u]=d;
	}
}
for(int q=0;q<n;q++) {
	for(int w=0;w<l;w++) {
		for(int e=0;e<m;e++) {
			c[q][w]+=a[q][e]*b[e][w];
		}
		if(w>0) {
			System.out.print(" ");
		}
		System.out.print(c[q][w]);
	}
	System.out.println();
}
sc.close();
  }
}

