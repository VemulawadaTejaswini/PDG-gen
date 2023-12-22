import java.util.Scanner;
class Main9{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int sum=0;
for(int i=a;i<=b;i++){
if(c%i==0)
sum=sum+1;
}
System.out.println(sum);
}
}