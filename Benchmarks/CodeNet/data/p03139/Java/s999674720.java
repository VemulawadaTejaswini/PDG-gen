import java.util.Scanner;

class Main{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char[][] w=new char[3][n];
for(int i=0;i<3;i++){
String input=s.next();
w[i]=input.toCharArray();
}
int count=0;
for(int i=0;i<n;i++){
if((w[0][i]==w[1][i]||w[1][i]==w[2][i])||w[0][i]==w[2][i]){
count++;
}
if((w[0][i]==w[1][i]&&w[1][i]==w[2][i])&&w[0][i]==w[2][i]){
count++;
}
}
System.out.println(n*2-count);
}
}