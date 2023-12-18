import java.util.Scanner;

public class Main{
     public static void main(String[] args){
Scanner scan= new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int count=0;

if(a==b && b==c){
 if(a%2==1 && b%2==0 && c%2==0)) count=-1;
}else{
while(a%2==0 && b%2==0 && c%2==0){
int a1=a;
int b1=b;
int c1=c;

a = c1/2 + b1/2;
b = a1/2 + c1/2;
c = a1/2 + b1/2;

count++;
}
}
System.out.println(count);

     }
}