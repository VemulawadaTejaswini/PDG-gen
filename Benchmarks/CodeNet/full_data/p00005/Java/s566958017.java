import java.io.*;
import java.util.*;

class Main{

public static void main(String args[]) throws java.io.IOException{
Scanner scan = new Scanner(System.in);
while(scan.hasNext()){
int a =nextInt();
int b = nextInt();
System.out.println(gcd(a,b)+" "+a*b/gcd(a,b));
}


}
public static long gcd(int a,int b){
if(b==0)return a;
return gcd(b,a%b);
}
}