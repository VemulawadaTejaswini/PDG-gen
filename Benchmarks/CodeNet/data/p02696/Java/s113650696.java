import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        Integer[] ary = new Integer[n];
        for (int i = 0 ; i< n; i++){
            double ax = a*(i+1)/b;
            int x =(int) Math.floor(ax);
            double bx = (i+1)/b;
            int y =(int) Math.floor(bx);
            ary[i] =x-a*y;
        }
        Arrays.sort(ary,Collections.reverseOrder());
        System.out.println(ary[0]);
        }
        }