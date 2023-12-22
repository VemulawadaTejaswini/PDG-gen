import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        int n = scan.nextInt();
        Long[] ary = new Long[n];
        for (int i = 0 ; i< n; i++){
            double ax = a*(i+1)/b;
            long x =(long)Math.floor(ax);
            double bx = (i+1)/b;
            long y =(long)Math.floor(bx);
            ary[i] =x-a*y;
        }
        Arrays.sort(ary,Collections.reverseOrder());
        System.out.println(ary[0]);
        }
        }