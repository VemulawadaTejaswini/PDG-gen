import java.util.*;
public class Main{
Scanner sc=new Scanner(System.in);void run(){
double max=0,min=Double.MAX_VALUE;
for(;sc.hasNextDouble();){
double t=sc.nextDouble();max=Math.max(t,max);min=Math.min(t,min);
}
System.out.println(max-min);}public static void main(String[] a){Main m = new Main();m.run();}}