import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        List<Integer> primeNumbers = new ArrayList<>();

        int devideNum = 2;
        while(N % devideNum == 0) {
            primeNumbers.add(devideNum);
            N /= 2;
        }

        devideNum++;
        while (N != 1) {
            if (N % devideNum == 0) {
                primeNumbers.add(devideNum);
                N /= devideNum;
            } else {
                devideNum +=2;
            }
        }

        //Debug
        for(int num: primeNumbers) {
            System.err.println(num);
        }

        Iterator<Integer> it = primeNumbers.iterator();
        int e = 1;
        int result = 0;
        int last = 0;

        main: for(int i=0; i<primeNumbers.size(); i++) {
            int current = primeNumbers.get(i);

            if(current == last) {
                e++;
            }else {
                e = 1;
            }

            for(int j=2; j<=e; j++) {
                if(i+j-1 >= primeNumbers.size()) {
                    continue main;
                }
                if(primeNumbers.get(i+j-1) != current) {
                    continue main;
                }
            }
            result++;
            last = current;
        }

        System.out.println(result);

    }
}
