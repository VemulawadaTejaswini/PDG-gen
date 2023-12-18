import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
long x=sc.nextLong();
long ans=(long)(x/11);
if(x-11*ans<6)ans++;
ans++;
System.out.println(ans);
}