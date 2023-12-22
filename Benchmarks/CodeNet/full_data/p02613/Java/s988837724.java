import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //AC, WA, TLE, RE

        int AC=0;
        int WA=0;
        int TLE=0;
        int RE=0;
        String[] x = new String[n];
        for(int i=0;i<n;i++){
            x[i]=sc.next();
        }

        String comp = "";
        for(int i=0;i<n;i++) {
            comp=x[i];
            if ("AC".equals(comp)) {
                AC = AC+1;
            } else if ("WA".equals(comp)) {
                WA = WA+1;
            } else if ("TLE".equals(comp)) {
                TLE = TLE+1;
            } else {
                RE = RE+1;
            }
        }

        System.out.println("AC x "+AC);
        System.out.println("WA x "+WA);
        System.out.println("TLE x "+TLE);
        System.out.println("RE x "+RE);
    }
}

