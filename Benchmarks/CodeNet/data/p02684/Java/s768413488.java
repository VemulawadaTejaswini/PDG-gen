import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        int[] A = new int[N+1];
        for(int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int now = 1;
        int kijun = 0;
        int count = 0;
        while(true) {
            now = A[now];
            count++;
            if(list.contains(now)) {
                kijun = now;
                break;
            }else {
                list.add(now);
            }
        }

        
        if(kijun == 1) {
            int[] x = new int[count];
            int i = 0;
            now = 1;
            while(true) {
                now = A[now];
                if(now == 1) break;
                x[i] = now;
                i++;
            }
            if(k % count == 0) System.out.println(1);
            else {
                int z = (int)(k % count)-1;
                System.out.println(x[z]);
            }
        }else {
            int[] x = new int[count];
            int[] saisho = new int[count];
            int first = 0;
            int last = 0;
            count = 0;
            now = 1;
            while(true) {
                now = A[now];
                count++;
                if(first == 0) {
                    if(now == kijun) {
                        first = count;
                        continue;
                    }
                    saisho[count-1] = now;
                }
                if(first != 0) {
                    if(now == kijun) {
                        last = count;
                        break;
                    }
                    x[count-first-1] = now;
                }
            }
            if(k < first) {
                System.out.println(saisho[(int)k]);
            }else {
                if((k-first) % (last-first) == 0) {
                    System.out.println(kijun);
                }else {
                    int z = (int)((k-first) % (last-first))-1;
                    System.out.println(x[z]);
                }
            }
        
        }
    }
}