import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int result = 0;
        for(int ir = 0; ir <= n; ir+=r ) {
        	if(ir <n) {
        		for(int ig = ir; ig <= n; ig +=g) {
        			if(ig < n) {
        				for(int ib = ig ; ib <= n ; ib+=b) {
        					if(ib == n) {
        						result++;
        					}
        				}
        			}else {
        				if(ig == n) {
        					result++;
        				}
        			}
        		}
        	}else {
        		if(ir == n) {
        			result++;
        		}
        	}
        }
        System.out.print(result);
    }
}