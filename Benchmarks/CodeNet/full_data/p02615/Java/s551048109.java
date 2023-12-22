import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        long com = 0;
        if(a.length <= 3){
            for(int i = 1; i < n; i++){
            com += a[i - 1];
        }
        System.out.println(com);
        return;
        }
        com += a[0] + a[1] + a[1];
        for(int i = 4; i < n; i++){
            com += a[i - 1];
        }
        System.out.println(com);
        scan.close();
    }
}
