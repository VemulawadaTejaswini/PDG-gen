import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer m = Integer.parseInt(scanner.next());
        Integer[] h =  new Integer[n];
        Integer[] a =  new Integer[n];
        Integer[] b =  new Integer[n];
        boolean[] total = new boolean[n];

        for(int i =0; i<n; i++) total[i] = true;
        for(int i =0; i <n; i++) h[i] = Integer.parseInt(scanner.next());

        for(int i = 0; i < m; i++) {
            a[i] =  Integer.parseInt(scanner.next());
            b[i] =  Integer.parseInt(scanner.next());
            total[a[i]-1] = false;
            total[b[i]-1] = false;
        }

        for(int i = 0; i < m; i++) {
            if(h[a[i]-1] > h[b[i]-1]) total[a[i]-1] = true;
            if(h[b[i]-1] > h[a[i]-1]) total[b[i]-1] = true;
        }


        int count = 0;
        for(int i =0; i < total.length; i++){
            if(total[i]) count++;
        }

        System.out.println(count);
    }
}
