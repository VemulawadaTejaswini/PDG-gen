import java.util.Scanner;
import java.math.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int a=100000;
for(int i=0;i<w;i++){
a+=a/20;
BigDecimal x=new BigDecimal(a);
x=x.setScale(-3,RoundingMode.CEILING);
a=x.intValue();
}
System.out.println(a);
}
}