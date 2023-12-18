import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       Scanner ab = new Scanner(System.in);

		int a= ab.nextInt();
		int b= ab.nextInt();
        
        if((a<=9)&&(b<=9)){
        System.out.println(a*b);
        }else{
            System.out.println(-1);
        }

    }
}