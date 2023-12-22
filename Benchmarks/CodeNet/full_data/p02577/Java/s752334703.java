import java.util.*;
 public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
  long sum=0;
  for(int i=0;i<s.length();i++){
  sum+=Integer.parseInt(s.substring(i,i+1));
  }
  if(sum%3==0) System.out.println("Yes");
  else System.out.println("No");
}}