import java.util.*
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int M1=sc.nextInt();
int D1=sc.nextInt();
int M2=sc.nextInt();
int D2=sc.nextInt();

if(M1!=12){
if(M1+1==M2&&D2==1){
System.out.println("1");
}else if(M1+1!=M2&&D2!=1){
System.out.println("0");
}
}

if(M1==12){
if(M2==1&&D2==1){
System.out.println("1");
}else if(M2!=1&&D2!=1){
System.out.println("0");
}
}
}
}

