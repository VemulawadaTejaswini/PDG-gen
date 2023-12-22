import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n%10;
      switch(a){
        case 0:
        case 1:
        case 6:
        case 8:
          System.out.println("pon");
          break;
        case 2:
        case 4:
        case 5:
        case 7:
        case 9:
          System.out.println("hon");
          break;
        case 3:
          System.out.println("bon");
          break;
      }
	}
}