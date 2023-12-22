import java.util.Scanner;
public class Main { 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);
long n=sc.nextLong(); 
int x=0;
int y=0;
int z=0;
while(n>=3600){
n=n-3600;
x=x+1;
}
while(n>=60){
n=n-60;
y=y+1;
}
z=(int)n;
System.out.print(x);
System.out.print(":");
System.out.print(y);
System.out.print(":");
System.out.println(z); } }
