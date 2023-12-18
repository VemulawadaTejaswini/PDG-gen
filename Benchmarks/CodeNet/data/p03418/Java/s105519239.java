import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        int count = 0;
        int mod;
    	for (int b = k + 1; b <= n; b++) {
    		for (int a = (k == 0) ? 1 : k; a <= n;) {
    			mod = a % b;
        		if (mod >= k) {
        			count++;
        			a++;
        		} else {
        			a += k - mod;
        		}
        	}
        }
        System.out.println(count);
    }
}