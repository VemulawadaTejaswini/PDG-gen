import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int R=sc.nextInt();
String ans="";
if(R<1200){ans="ABC";}else if(R<2800){ans="ARC";}else{ans="AGC";}
System.out.println(ans);
}}