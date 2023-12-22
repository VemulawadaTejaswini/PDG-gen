import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n+1];
        for (int i=1;i<=n;i++)a[i]=sc.nextInt();
        HashSet<Integer> hash = new HashSet<>();
        int city = 1;
        int count = 0;
        while (!hash.contains(city)){
            hash.add(city);
            city = a[city];
            count++;
        }
        k-=count;
        int ins = 1;
        int city2 = a[city];
        while (city!=city2){
            city2=a[city2];
            ins++;
        }
        k%=ins;
        for (int i=0;i<k;i++)city=a[city];
        System.out.println(city);
    }
}
