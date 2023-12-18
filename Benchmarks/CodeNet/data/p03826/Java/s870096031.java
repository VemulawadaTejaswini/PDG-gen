import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long a=sc.nextInt();
long b=1;
for(int i=1;i<=a;i++){
b*=i;
}
a=b%(long)10000000000;
System.out.println(a);
}
}