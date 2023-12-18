import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int knum = scan.nextInt();
        int snum = scan.nextInt();
        int count = 0;
        int sum = 0;

        for(int i=0; i<=knum; i++) {

            for(int j=0; j<=knum; j++) {
                if(i+j<=snum) {


                    boolean flag = true;
                    int k=0;
                    while (flag) {

                        sum = i+j+k;
                       // System.out.println("i: " + i + ", j:" + j+ ", k:" + k + "sum:" + sum);

                        if (sum == snum) {
                            count++;
                        } else if(sum > snum) {
                            flag = false;
                        }

                        k++;
                    }

                }
            }

        }
        System.out.println(count);

    }
}
