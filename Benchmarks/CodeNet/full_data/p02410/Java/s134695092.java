import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c[][]=new int[a][b];
int d[]=new int[b];
int e[]=new int[a];
for(int i=0;i!=a;i++) {
	for(int j=0;j!=b;j++) {
		c[i][j]=scan.nextInt();
	}
}
for(int i=0;i!=b;i++) {
	d[i]=scan.nextInt();
}
int k=0;
for(int i=0;i!=a;i++) {
	k=0;
for(int j=0;j!=b;j++) {
	k+=c[i][j]*d[j];
}
e[i]=k;
}
for(int i=0;i!=a;i++){
	System.out.println(e[i]);
}
}
}

