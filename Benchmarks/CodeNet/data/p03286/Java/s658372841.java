import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int temp=n;
String ans="";
while(temp!=0){
if(temp%(-2)==0){
ans="0"+ans;
}else{
ans="1"+ans;
}
if(temp%(-2)==-1){temp=temp/(-2)+1;}else{temp/=(-2);}
}
System.out.println(ans);
}}