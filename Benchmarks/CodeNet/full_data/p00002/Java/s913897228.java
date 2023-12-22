import java.util.*;
import java.io.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
   while(sc.hasNext()){
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int keta=1;
	   if((a+b)/10>0)keta++;
	   if((a+b)/100>0)keta++;
	   if((a+b)/1000>0)keta++;
	   if((a+b)/10000>0)keta++;
	   if((a+b)/100000>0)keta++;
	   if((a+b)/1000000>0)keta++;
	   System.out.println(keta);
	  }
   
      }
}