import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int maxNumber = Integer.valueOf(inputs[0]);
        int multipleNumber = Integer.valueOf(inputs[1]);
        int a = 1;
        int b = 1;
        int c = 1;
        int count = 0 ;
        for( int i = 1; i<=maxNumber; i++ ) {
            a = i;
            b = 1;
            int k2 = 1;
            while (b<=maxNumber) {
                c = 1;
                int k3 =1;
                int abMultiple = k2*multipleNumber;
                k2++;
                if(abMultiple<=a) {
                    continue;
                }
                b = abMultiple - a;
                if(b>maxNumber) {
                    continue;
                }
                while(c<=maxNumber) {
                    int bcMultiple = k3*multipleNumber;
                    k3++;
                    if(bcMultiple<=b) {
                        continue;
                    }
                    c = bcMultiple - b;
                    if(c>maxNumber) {
                        continue;
                    }
                    if( (a+c)%multipleNumber == 0 )
                        count++;
                }

            }

        }
        System.out.println(count);
    }

}
