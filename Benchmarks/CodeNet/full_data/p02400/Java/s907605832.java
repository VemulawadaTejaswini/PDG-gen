import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
Formatter frm=new Formatter();
double r=scan.nextDouble();
double S=Math.PI*r*r*1.0;
double d=2*Math.PI*r*1.0;
System.out.println(String.format("%5f",S)+" "+String.format("%5f",d));
}}