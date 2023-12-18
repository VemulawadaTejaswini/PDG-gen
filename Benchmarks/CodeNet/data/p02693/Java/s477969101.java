import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class  Mian {
  public   static  void main(String[]args){
Scanner in =new Scanner(System.in);
int k=in.nextInt();

int a=in.nextInt();
int b=in.nextInt();
if ((k*2)<Math.max(a,b))
System.out.print("OK ");
  else System.out.print("NG");}}