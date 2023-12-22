import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int[] sum=new int[101];

int[][] h=new int[101][101];
int[]  m=new int[101];
int a=scan.nextInt();
for(int d=0;d<a;d++){
sum[d]=0;
}
int b=scan.nextInt();
for(int c=0;c<a;c++){
for(int d=0;d<b;d++){
h[c][d]=scan.nextInt();
}
}
for(int d=0;d<b;d++){
m[d]=scan.nextInt();
}
for(int c=0;c<a;c++){
for(int d=0;d<b;d++){
sum[c]+=h[c][d]*m[d];

}
}
for(int c=0;c<a;c++){
System.out.println(sum[c]);
}
}
}