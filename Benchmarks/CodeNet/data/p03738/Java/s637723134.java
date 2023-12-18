import java.util.Scanner;

public class Main {
	//static Map<Long,Long>map=new TreeMap<>();
	static int k;
	static String ans="NO";
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
          if(a>b)ans="GREATER";
          if(a<b)ans="LESS";
          if(a==b)ans="EQUAL";
       System.out.println(ans);
    }
}