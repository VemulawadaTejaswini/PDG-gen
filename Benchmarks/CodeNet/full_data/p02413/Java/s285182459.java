import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int count[][]=new int[a+1][b+1];
for(int i=0;i!=a;i++) {
	int sum=0;
	for(int j=0;j!=b;j++) {
		count[i][j]=scan.nextInt();
		sum+=count[i][j];
	}
	count[i][b]=sum;
}
for(int i=0;i!=b+1;i++) {
	int sum=0;
	for(int j=0;j!=a;j++) {
		sum+=count[j][i];
	}
	count[a][i]=sum;
}
for(int i=0;i!=a+1;i++) {
	for(int j=0;j!=b+1;j++) {
	System.out.print(count[i][j]);
	if(j!=b) {
		System.out.print(" ");
	}
	}
	System.out.println();
	}

}
}
