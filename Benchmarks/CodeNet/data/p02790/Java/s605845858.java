import java.util.Scanner;
import java.lang.Math;
public class test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        String str1 = (Integer.toString(a))*b; 
    	String str2 = (Integer.toString(b))*a;
      	if (str1<str2){
        System.out.println(str1);}
      else{
      System.out.println(str2);
      }
    }
}
