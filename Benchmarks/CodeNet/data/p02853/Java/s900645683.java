import java.util.Scanner;

class main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int num= scan.nextInt();
int numm=scan.nextInt();
int sum=0;

if(num==3){
    sum=sum+100000;
}
if(num==2){
    sum=sum+200000;
}
if(num==1){
    sum=sum+300000;
}
if(numm==3){
    sum=sum+100000;
}
if(numm==2){
    sum=sum+200000;
}
if(numm==1){
    sum=sum+300000;
}
if(num==1&&numm==1){
    sum=sum+400000;
}
System.out.println(sum);
}
}