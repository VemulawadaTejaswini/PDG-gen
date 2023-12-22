import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        boolean flag=false;
        if(N==0) {
            System.out.println(X);
            flag=true;
        }else {
            Set<Integer> nums = new HashSet<Integer>();
            for(int i=0; i<N; i++) {
                nums.add(sc.nextInt());
            }

            for(int i=0; i<Math.min(X,101-X)+1;i++) {
                if(!nums.contains(X-i)) {
                    System.out.println(X-i);
                    flag=true;
                    break;
                }else if(!nums.contains(X+i)){
                    System.out.println(X+i);
                    flag=true;
                    break;
                }
            }
            if(!flag) {
                if(X<=50) {
                    System.out.println(0);
                }else {
                    System.out.println(101);
                }
            }

        }
	}

}
