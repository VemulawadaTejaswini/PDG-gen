import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int d=sc.nextInt();
int n=(600/d)-1;
long s=n*(n+1)*(2n+1)*Math.pow(d,3)/6;
System.out.println(s);
}
}
}