import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> l = new ArrayList<>();
        int k = sc.nextInt();

        int m = 1;
        while(l.size() < k){
            int n = m;
            do{
                n--;
                if(n == 0){
                    break;
                }

            }while (! (getNwaruSnNum(n) <= getNwaruSnNum(m)) );
            if(!l.contains(n) && n != 0){
                l.add(n);
            }
            m++;
        }
        for (Integer aL : l) {
            System.out.println(aL);
        }

    }

    static double getNwaruSnNum(int n){
        int a = n;
        int sn = 0;
        do{
            sn += a % 10;
            a /= 10;
        }while(a > 0);

        return (double) n / (double) sn;
    }
}