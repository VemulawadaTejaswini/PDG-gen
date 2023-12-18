import java.util.*;

public class Main {

    static List<Long> plist = new ArrayList<>();
    static List<Long> alllist = new ArrayList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();



        plist.add((long)1);
        alllist.add((long)1);
        for(int i = 1;i <= n;i++){
            plist.add(plist.get(i-1)*2 + 1);
            alllist.add(alllist.get(i-1)*2 + 3);
        }

        System.out.println(calcP(x,n));
    }

    public static long calcP(long x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(x <= alllist.get(n-1)+1){
            return calcP(x-1, n-1);
        } else {
            return plist.get(n-1) + 1 + calcP(x-alllist.get(n-1) -2, n-1);
        }
    }

}