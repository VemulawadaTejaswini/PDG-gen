import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 if(a>b){
 int tenp1=a;
 int a=b;
 int b=temp1;
 }
 if(b>c){
 int temp2=b;
 int b=c; 
 int c=temp2;
 }
 if(a>b){
 int temp3=a;
 int a=b;
 int b=temp3;
 }
 System.out.println(a+" "+b+" "+c);
 }
 }