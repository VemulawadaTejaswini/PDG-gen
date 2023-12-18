import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int m=0,a=0,r=0,c=0,h=0;
for(int i=0;i<n;i++){
String p=sc.next();
if(p.charAt(0)=='M')m++;
if(p.charAt(0)=='A')a++;
if(p.charAt(0)=='R')r++;
if(p.charAt(0)=='C')c++;
if(p.charAt(0)=='H')h++;
}
long ans=m*a*r+m*a*c+m*a*h+m*r*c+m*r*h+m*c*h+a*r*c+a*r*h+a*c*h+r*c*h;
System.out.println(ans);
}}