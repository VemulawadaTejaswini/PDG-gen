import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
double a=100000;
for(int i=0;i<w;i++){
a=a*1.05/1000;
BigDecimal x=new BigDecimal(a);
x=x.setScale(0,RoundingMode.CEILING);
a=x.doubleValue()*1000;
}
System.out.println(a);
}
}