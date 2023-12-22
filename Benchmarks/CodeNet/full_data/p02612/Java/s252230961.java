import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     	int N = sc.nextInt();
      
      	int raise =(int) N %1000;
      	int answer = 1000-raise;
      	System.out.println(String.valueOf(answer));
    }
}