import java.util.Scanner;
  
class Main{
public static void main(String[] args){
  
Scanner scan = new Scanner(System.in);
  
int a = scan.nextInt();
int b = scan.nextInt();
  
int d,r;
float f;

if(1 <= a && b <= 1000000000){ 
d = a / b ;
r = a % b ;
f = a / b;
  
System.out.println(d+" "+r+" "+f);
}
    }
}