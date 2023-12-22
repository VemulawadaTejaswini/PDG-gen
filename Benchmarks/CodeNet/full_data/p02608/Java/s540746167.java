import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i <=n;i++ ) {
        	int count = 0;
        	for(int x =1; x*x <i;x++) {
        		for(int y =1; y*y <i;y++) {
        			for(int z =1; z*z <i;z++) {
                		int f =x*x+y*y+z*z+x*y+y*z+z*x;
                		if(f==i) {
                			count++;
                			break;
                		}
                	}
        		}
        	}
        	System.out.println(count);
        }
    }

}