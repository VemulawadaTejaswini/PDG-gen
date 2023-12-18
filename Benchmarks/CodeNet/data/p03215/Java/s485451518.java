import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] suma = new long[n+1];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            suma[i+1] = suma[i] + a[i];
        }
        sc.close();

        int num = (n+1)*n/2;
        long[] b = new long[num];
        ArrayList<String> bs = new ArrayList<String>();
        int len = 51;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                b[count] = suma[j+1] - suma[i];
                bs.add(String.format("%" + len + "s", Long.toBinaryString(b[count])).replace(' ', '0'));
                count++;
            }
        }

        boolean[] one = new boolean[len];
        for(int i=0; i<len; i++){
            count = 0;
            for(int j=0; j<bs.size(); j++){
                if(bs.get(j).charAt(i) == '1') count++;
            }
            if(count >= k){
                one[i] = true;
                int size = bs.size();
                for(int l=0; l<size; l++){
                    if(bs.get(size-l-1).charAt(i) == '0') bs.remove(size-l-1);
                }
            }
        }

        long ans = 0;
        for(int i=0; i<len; i++){
            if(one[i]) ans += Math.pow(2, (len-1-i));
        }

        System.out.println(ans);

    }
}