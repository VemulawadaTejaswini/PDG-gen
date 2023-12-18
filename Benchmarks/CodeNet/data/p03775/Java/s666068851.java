import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  long N=sc.nextLong();
  long tmp=(long)(Math.sqrt(N));
  while(N%tmp!=0){
    tmp++;
  }
  long val=Math.max(tmp,N/tmp);
  System.out.println(String.valueOf(val).length());
}
}