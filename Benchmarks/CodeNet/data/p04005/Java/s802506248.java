import java.util.*;

public class Main {
    
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();
		int c = sc.nextInt();
                
                if(a<2 || b<2 || c<2 || a>1000000000 || b>1000000000 || c>1000000000)
                {
                    return;
                }
             
                int res = a*b*c;
                
                int blue = a*b*2;
                int red = res-blue;
                
                int diff = red-blue;
                
                if(diff<0)
                {
                    diff = diff*(-1);
                }

		System.out.println(diff);
	}
    
}