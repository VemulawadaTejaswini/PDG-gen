import java.util.Scanner;
public class Main{
public static void main( String [] args){
Scanner in= new Scanner( System.in);
int c,t,a,b,e,f,m,n,i,j;
c= 2;
t= 4;
m= 0;
a= in.nextInt();
b= in.nextInt();
for (i=0;i<=a; i++){
e= c*i;
for (j= 0;  j <= a; j++){
f= t*a;
n= e+f;
}if(n==b){
m++;
}
} if (m==0){
System.out.println ("No");
}else {
 System.out.println ("Yes");
  }
}
}


