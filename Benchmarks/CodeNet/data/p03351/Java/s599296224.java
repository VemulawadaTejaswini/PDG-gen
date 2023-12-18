import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int count,count2;
    count = Math.abs(a-b);
    count2 = Math.abs(b-c);
		if(count<=d && count2<=d){
          System.out.println("Yes");
    }
    else if(Math.abs(a-c)<=d){
          System.out.println("Yes");
    }
    else{
          System.out.println("No");
    }
  }
 }
