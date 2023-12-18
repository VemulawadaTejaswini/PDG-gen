import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        //String S = sc.next();

        int a;
        
        a = (int)Math.pow(100, D) * N;
        if(N==100){
            a = (int)Math.pow(100, D) * (N+1);
        }
        System.out.println(a);
        
        
                
            

        }
        
        

        
        
        }