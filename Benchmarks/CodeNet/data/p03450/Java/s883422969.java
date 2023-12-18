import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> peopleX = new ArrayList<Integer>(n+1);
        ArrayList<Boolean> check = new ArrayList<Boolean>(n+1);

        boolean possible = true;
        for(int i = 0; i <= n; i++){
            check.add(false);
            peopleX.add(0);
        }
        for(int i = 0; i < m; i++){
            int xr = sc.nextInt();
            int xl = sc.nextInt();
            int d = sc.nextInt();
            boolean cr = check.get(xr);
            boolean cl = check.get(xl);
            if(!cl && !cr){
                peopleX.set(xl, 1);
                peopleX.set(xr, xl+d);
                check.set(xl, true);
                check.set(xr, true);
            }else if(!cl){
                peopleX.set(xl, xr-d);
                check.set(xl, true);
            }else if(!cr){
                peopleX.set(xr, xl+d);
                check.set(xr, true);
            }else if(peopleX.get(xr) - peopleX.get(xl) != d){
                possible = false;
            }
        }

        String ans;
        if(possible){
            int min = 1000000000;
            int max = 1;
            for(int i = 0; i <= n; i++){
                if(check.get(i)) {
                    if (i < min) {
                        min = i;
                    } else if (i > max) {
                        max = i;
                    }
                }
            }

            if(max - min >= 1000000000){
                possible = false;
            }
        }

        ans = possible ? "Yes" : "No";
        System.out.println(ans);
    }
}
