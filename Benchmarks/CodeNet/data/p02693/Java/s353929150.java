import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class  Main {
  public   static  void main(String[]args){
Scanner in =new Scanner(System.in);
int k=in.nextInt();
int a=in.nextInt();
int b=in.nextInt();
if (k%b==0||k%a==0) {
  System.out.print("OK ");
} else System.out.print("NG");}}