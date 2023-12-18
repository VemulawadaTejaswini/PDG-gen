import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
int D=sc.nextInt();
String ans;
if(A+B==C+D){ans="Balanced";}else if(A+B>C+D){ans="Left";}else{ans="Right";}
System.out.println(ans);
}}