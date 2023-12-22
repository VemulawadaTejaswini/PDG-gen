import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int min =Math.min(a, b)	;
    int c2 = c*2;

    if(min*k<=c2 && a+b-min<=c2){
    	System.out.println("Yes");
    }else{
    	System.out.println("No");
      }
}
}
