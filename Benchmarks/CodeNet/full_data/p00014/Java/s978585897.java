import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int d=sc.nextInt();
int n=600/d-1;
int s=n*(n+1)*(2n+1)*d*d*d/6;
System.out.println(s);
}
}
}