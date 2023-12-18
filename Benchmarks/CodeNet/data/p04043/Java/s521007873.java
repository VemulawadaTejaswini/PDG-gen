import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
 
if(a&&b==5){
if(c==7){
System.out.println("YES");
}else{System.out.println("NO");}
}else{System.out.println("NO");}
 
if(a&&c==5){
if(b==7){
System.out.println("YES");
}else{System.out.println("NO");}
}else{System.out.println("NO");}
 
if(b&&c==5){
if(a==7){
System.out.println("YES");
}else{System.out.println("NO");}
}else{System.out.println("NO");}
 
 
}}