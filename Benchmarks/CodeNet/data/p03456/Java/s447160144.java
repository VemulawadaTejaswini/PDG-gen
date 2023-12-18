import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sum = 10*a + b;
        if(Math.sqrt(sum)%1 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
