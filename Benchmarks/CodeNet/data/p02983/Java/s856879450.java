import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();

        
        long res;
    
        long bai = L/2019;

        if(L%2019==0 || 2019*(bai+1)<=R){
            res = 0;
        }else{
            long l=L-2019*bai;
            long r=R-2019*bai;
            res = l*(l+1);
        }
        System.out.println(res);
        
        }
    }