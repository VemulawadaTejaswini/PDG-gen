import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long a=Long.parseLong(sc.next());
long b=Long.parseLong(sc.next());
int count=0;
while(a<=b){a*=2;count++;}
System.out.println(count);
}
}