import java.util.*;
class Main{
public static void main(String[]args){
int i=1;
  long a=101;
  long po=sc.nextLong();
  while(a<po){
    a*=a/101;
    i++;
  }System.out.println(a);
}
}