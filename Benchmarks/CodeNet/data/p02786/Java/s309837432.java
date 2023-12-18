import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		double s =  (Math.log(h)/Math.log(2));
		//System.out.println((long)s);
		if(h==1) {
			System.out.println(h);
		}
		else {
			int n = (int)s;
			long h1 = 2*(power(2,n)-1);
			System.out.println(h1+1);
			
		}
		
	}
	static long power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } 

}
