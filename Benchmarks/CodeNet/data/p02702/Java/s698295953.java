import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long count = 0;
    int len = s.length();
   for(int i = 1; i <= 200000; i++) {
	   String judge = String.valueOf(2019*i);
	   if(s.contains(judge)) {
	   if(s.indexOf(judge)==s.lastIndexOf(judge)) {
		   count++;
	   }
	   if(s.indexOf(judge)!=s.lastIndexOf(judge)) {
		   count +=2;
   }
	   }
   }
   System.out.println(count);
  }
}