import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sqN = (int)Math.sqrt(n)+1;
        long[] divN = new long[10000];
        divN[0] = n;
        int num1 = 1;
        int num2 = 1;
        for(int i = 2 ; i < sqN; i++){
            if((n % i) == 0) {
                divN[num1] = i;
                num1++;
                if(n != i*i) {
                    divN[num1] = n / i;
                    num1++;
                }
            }
            if(((n-1) % i) == 0) {
                num2++;
                if((n-1) != i*i) {
                    num2++;
                }
            }
        }

        int count = num2;
        for(int i = 0 ; i < num1 ; i++){
            long k = n;
            while((k % divN[i]) == 0){
                k /= divN[i];
            }
            if((k % divN[i]) == 1){
                count++;
            }
        }

        System.out.println(count);
    }
}
