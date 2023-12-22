import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
Formatter frm=new Formatter();
double r=scan.nextDouble();
double S=Math.PI*r*r;
double d=2*Math.PI*r;
System.out.println(("%5f",S)+" "+("%5f",d));
}}