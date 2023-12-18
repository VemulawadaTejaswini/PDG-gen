import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int n = Integer.parseInt(str);

        str = scan.nextLine();
        String[] substr = str.split(" ", 0);

        int[] array = new int[200000];
        for (int i=0; i<n; i++) {
        	array[i] = Integer.parseInt(substr[i]);
        }

        int l = lcm(array[0], array[1]);
        for (int i=2; i<n; i++) {
        	l = lcm(array[i],l);
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
        	ans += l/array[i];
        }
        System.out.println(ans);

    }

    //最小公倍数lcm
    static int lcm (int a, int b) {
    	int temp;
    	long c = a;
    	c *= b;
        while((temp = a%b)!=0) {
        	a = b;
        	b = temp;
        }
        return (int)(c/b);
    }
}