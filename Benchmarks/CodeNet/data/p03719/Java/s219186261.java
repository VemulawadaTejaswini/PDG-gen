import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(C>=A && C<=B){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

	}


    public static int intsum(int[] x){
        int t = 0;
        for (int a:x){
            t += a;
        }
        return t;
    }
    public static long longsum(long[] x){
        long t = 0;
        for (long a:x){
            t += a;
        }
        return t;
    }
}

