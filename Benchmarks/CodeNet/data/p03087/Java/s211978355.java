import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] sp = S.split("");
        int[] l = new int[Q];
        int[] r = new int[Q];
        
        int[] sum = new int[sp.length];
        sum[0] = 0;
        int count = 0;
        for(int i = 1; i < N; i++) {
            if(sp[i-1].equals("A") && sp[i].equals("C")) {
                count++;
                sum[i-1] = count;
            }
            sum[i] = count;
        }
        
        /*
        for(int i = 0; i < N; i++) {
            System.out.print(sum[i]+" ");
        }
        */
        
        int last = 0;
        int first = 0;
        int ans = 0;
        for(int i = 0; i < Q; i++) {
            first = Integer.parseInt(sc.next());
            last = Integer.parseInt(sc.next());

            if(sum[last-1] == 0) {
                System.out.println(0);
            //last 1以上
            }else if(last - first == 1) {
                if(sum[first-1] != sum[last-1]) {
                    System.out.println(0);
                }else {
                    if(first == 1) {
                        System.out.println(1);
                    }else {
                        if(sum[first-1] == sum[first-2]) {
                            System.out.println(1);
                        }else {
                            System.out.println(0);
                        }
                    }
                }
            //last1以上でlast-first > 1
            }else {
                if(first == 1) {
                    if(sum[last-1] == sum[last-2]) {
                        System.out.println(sum[last-1]);
                    }else {
                        System.out.println(sum[last-1]-1);
                    }
                }else {
                    if(sum[last-1] == sum[last-2]) {
                        if(sum[first-1] == sum[first-2]) {
                            System.out.println(sum[last-1] - sum[first-1] - 1 + 1);
                        }else {
                            System.out.println(sum[last-1] - sum[first-1] + 1);
                        }
                    }else {
                        if(sum[first-1] == sum[first-2]) {
                            System.out.println(sum[last-1] - sum[first-1] - 2 + 1);
                        }else {
                            System.out.println(sum[last-1] - sum[first-1] - 1 + 1);
                        }
                    }
                }
            }
            
        }
        
    }
}