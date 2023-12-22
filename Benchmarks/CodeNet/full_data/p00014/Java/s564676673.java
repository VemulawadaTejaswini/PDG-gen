import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
long d=sc.nextLong();
long n=(600/d)-1;
long s=(long)((2*Math.pow(n,3)+3*Math.pow(n,2)+n)*Math.pow(d,3))/6;
System.out.println(s);
}
}
}