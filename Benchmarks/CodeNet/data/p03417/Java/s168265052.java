import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n<2){
            if(m<2){
                System.out.println("0");
                return;
            }else{
                System.out.println(m-2);
                return;
            }
        }
        if(m<2){
            System.out.println(n-2);
            return;
        }

        System.out.println((n-2)*(m-2));
        
    }
}
