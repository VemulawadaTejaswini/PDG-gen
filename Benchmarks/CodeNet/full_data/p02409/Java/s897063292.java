import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int [] [] [] a=new int [4] [3] [10];
int n=sc.nextInt();
for(int i=0;i<4;i++) {
	for(int u=0;u<3;u++) {
		for(int y=0;y<10;y++) {
			a[i][u][y]=0;
		}
	}
}

for(int s=0;s<n;s++) {
int b=sc.nextInt();
int f=sc.nextInt();
int r=sc.nextInt();
int v=sc.nextInt();
	a[b-1][f-1][r-1]+=v;
}
for(int q=0;q<4;q++) {
	if(q>0) {
		System.out.println("####################");
	}
	for(int w=0;w<3;w++) {
		for(int e=0;e<10;e++) {
			System.out.print(" "+(a[q][w][e]));
		}
		System.out.println();
	}
}
sc.close();
  }
}




