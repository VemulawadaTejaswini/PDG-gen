import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        ArrayList<Long> primeNumber = new ArrayList<Long>();
        primeNumber.add(2l);
        long n = 2;
        boolean b = true;
        while (b){
            for(long i = 2;i < n*n;i++){
                if (b){
                    boolean c = true;
                    for (long m:primeNumber){
                        if (i % m == 0){
                            c = false;
                        }
                    }
                    if (c){
                        if (Collections.max(primeNumber)==x){
                            System.out.println(x);
                            b=false;
                        }
                        if (i>x&&b){
                            System.out.println(i);
                            b=false;
                        }
                        primeNumber.add(i);
                    }
                }
            }
            n = n*n;
        }

    }

}