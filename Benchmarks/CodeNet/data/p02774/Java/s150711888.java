import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nMax = (n * (n-1)) / 2;
        int k = scan.nextInt();
        int p = 1;//積を求めるときの小さい数の方
        ArrayList<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) l.add(scan.nextInt());
        scan.close();
        Collections.sort(l);

        while(k > n - p){
            k -= (n - p);
            p++;
        }

        System.out.println(l.get(p) * l.get(p + k));
    }
}