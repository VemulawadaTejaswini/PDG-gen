import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        Long[] ary = new Long[n];
        String line2 = sc.nextLine();
        String[] line3 = line2.split(" ");
        for(int i = 0; i < n; i++)  ary[i] = Long.parseLong(line3[i]);
        Arrays.sort(ary);
        for(int i = 0; i < m; i++){
            if(ary.length > 1 && ary[n - 1] < ary[n - 2]) Arrays.sort(ary);
            ary[n - 1] = ary[n - 1] / 2;
        }
        long sum = 0;
        for(int i = 0; i < n; i++)  sum += ary[i];
        System.out.println(sum);
    }
}