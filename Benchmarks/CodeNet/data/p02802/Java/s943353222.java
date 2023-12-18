import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int p;
        String s;

        Set<Integer> OK = new HashSet<Integer>();
        List<Integer> PENA = new ArrayList<Integer>();
        int[] ok_ar = new int[n];

        for(int i= 0;i<n;i++){
            ok_ar[i] = 0;
        }

        for(int i = 0 ; i < m ; i++){
            p = sc.nextInt();
            s = sc.next();

            switch(s){
                case "WA":
                    if(ok_ar[p]==0){
                        PENA.add(p);
                    }
                    break;
                case "AC":
                    OK.add(p);
                    ok_ar[p]++;
                    break;
            }
        }
        int ok = OK.size();
        int pena = PENA.size();
        System.out.print(ok + " "+pena);

    }
}