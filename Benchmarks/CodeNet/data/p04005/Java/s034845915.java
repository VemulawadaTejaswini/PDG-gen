import java.util.*;

public class Main {
    
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();

		long b = sc.nextInt();
		long c = sc.nextInt();
                
                if(a<2 || b<2 || c<2)
                {
                    return;
                }
             
                long res = a*b*c;
                
                long blue = a*b*2;
                long red = res-blue;
                
                long diff = red-blue;
                
                if(diff<0)
                {
                    diff = diff*(-1);
                }

		System.out.println(diff);
	}
    
}