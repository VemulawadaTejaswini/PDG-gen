import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = "";
        for (int i=0; i<n; i++) s += sc.next();

        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<n-k+1; i++){
            char[] c = s.toCharArray();
            char[] c1 = new char[k];
            for (int j=0; j<k; j++){
                c1[j] = c[i];
                i++;
            }
            Arrays.sort(c1);
            i -= k;
            int y = 0;
            for (int z=i; z<i+k; z++){
                c[z] = c1[y];
                y++;
            }
            c.toString();
            String tc = "";
            for (int q=0; q<c.length; q++){
                tc += c[q];
            }

            int cnt = map.containsKey(tc) ? map.get(tc) : 0;
            map.put(tc, cnt + 1);
        }

        System.out.println(map.size());
//        System.out.println(map);
    }
}