import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i =1;
    if (N==0) {
      System.out.println(i);
    } else {
      i = i + 1;
      N = sc.nextInt();
      if (N==0) {
        System.out.println(i);
   	  } else {
        i = i + 1;
        N = sc.nextInt();
        if (N==0) {
     	 System.out.println(i);
   		 } else {
     		 i = i + 1;
     		 N = sc.nextInt();
          	if (N==0) {
      			System.out.println(i);
   			 } else {
     			 i = i + 1;
     			 System.out.println(i);
   			 }
          }
      }
  }
}
}


