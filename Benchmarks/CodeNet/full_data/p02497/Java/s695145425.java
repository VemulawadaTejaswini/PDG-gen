import java.util.Scanner;
   
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
for ( int n = 1; n > 0; n++){ 
int a = sc.nextInt() ;
int b = sc.nextInt() ;
int c = sc.nextInt() ;
if( a < 0 && b < 0 && c < 0){
break;
}
int d = a + b;
if ( a < 0 || b < 0){
System.out.println("F");
}else{
switch(d){
case(d => 80);
System.out.println("A");
break;
case(d => 65 && d < 80);
System.out.println("B");
break;
case(d => 50 && d < 65);
System.out.println("C");
break;
case(d => 30 && d < 50);
if (c => 50){ 
System.out.println("C");
} else {
System.out.println("D");
}
break;
default:
System.out.println("F");
break;
}
}
}
}
}