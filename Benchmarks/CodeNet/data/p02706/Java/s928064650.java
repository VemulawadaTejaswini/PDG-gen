import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();

int num=0;

for(int n=0;n<M;n++){
int An=sc.nextInt();
N=N-An;
}
if(N>=0){
System.out.println(N);
}else if(N<0){
System.out.println(-1);
}
}
}