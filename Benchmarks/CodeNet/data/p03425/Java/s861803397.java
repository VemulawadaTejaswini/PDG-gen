import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] a = {"M", "A", "R", "C", "H"};
        for(String s:a) {
            map.put(s, 0);
        }
        for(int i = 0; i<N; i++) {
            String x = sc.next().substring(0,1);
            int c = (map.containsKey(x))? map.get(x): 0;
            map.put(x, c+1);
        }

        int sum = 0;
        for(int i = 0; i<3; i++) {
            for(int j = i+1; j<4; j++) {
                for(int k = j+1; k<5; k++) {
                    sum +=  map.get(a[i])*map.get(a[j])*map.get(a[k]);
                }
            }
        }
        System.out.println(sum);
    }
}