import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> set_1 = new HashSet<Integer>();
        Set<Integer> set_N = new HashSet<Integer>();



        for(int i = 0; i < m; i++){
        	int a = sc.nextInt();
        	int b = sc.nextInt();

        	if(a == 1){
        		set_1.add(b);
        	}else if(b == n){
        		set_N.add(a);
        	}
        }

        //System.out.printf("%d\n",input[0][0]);

        boolean isPossible = false;

        for (int ary:set_1)
        {
        	for(int ary_n:set_N)
        	{
        		if(ary == ary_n)
        		{
        			isPossible = true;
        			break;
        		}
        		if(isPossible == true)break;
        	}
        	if(isPossible == true)break;

        }


        if(isPossible){
        	System.out.printf("POSSIBLE");
        }else{
        	System.out.printf("IMPOSSIBLE");
        }

    }

}