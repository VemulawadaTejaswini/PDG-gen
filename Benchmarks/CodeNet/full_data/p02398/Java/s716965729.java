import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int a=scan.nextint();
int b=scan.nextint();
int c=scan.nextint();
int sum=0;
for(a;a<=b;a++){
if(c%a==0)
sum=sum+1;
}
System.out.println(sum);
}