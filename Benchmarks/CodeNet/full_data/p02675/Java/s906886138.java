import java.util.Scanner;
class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int n = N % 100 % 10;
      
      switch(n){
        case 0: System.out.println("pon"); break;
        case 1: System.out.println("pon"); break;
        case 2: System.out.println("hon"); break;
        case 3: System.out.println("bon"); break;
        case 4: System.out.println("hon"); break;
        case 5: System.out.println("hon"); break;
        case 6: System.out.println("pon"); break;
        case 7: System.out.println("hon"); break;
        case 8: System.out.println("pon"); break;
        case 9: System.out.println("hon"); break;
      }    