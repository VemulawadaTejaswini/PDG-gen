import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int N = 4;
        int[] monsters = {5, 13, 8, 1000000000}; //{1000000000, 1000000000, 1000000000}; //{2, 10, 8, 40}; //{5, 13, 8, 1000000000};

        int res = minLife(N, monsters);
        System.out.println(res);

    }

    private static int minLife(int n, int[] monsters) {
        int min = Integer.MAX_VALUE;
        int[] cache = new int[n];


        for (int i=0; i < monsters.length; i++){
            for (int j=i; j<monsters.length; j++){
                int val = Math.abs(monsters[i] - monsters[j]);
                if (val == 0){
                    min = monsters[i];
                    cache[i] = min;
                }
                else {
                    min = min < val ? min : val;
                    cache[i] = min;
                }

            }
        }
        if (Arrays.equals(monsters, cache)){
            Arrays.sort(cache);
            return cache[0];
        }
        else
            return minLife(n, cache);
    }
}
