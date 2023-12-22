import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean search(int[] num, int key){
        int len = num.length;
        num[len-1] = key;

        int i = 0;
        while (num[i] != key){
            i++;
        }

        return i != len-1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n+1];
        String[] strings = br.readLine().split("\\s");
        for (int i=0; i<strings.length; i++){
            num[i] = Integer.parseInt(strings[i]);
        }

        int q = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split("\\s");
        int sum = 0;
        for (int i=0; i<q; i++){
            if (search(num, Integer.parseInt(strs[i]))){
                sum++;
            }
        }

        System.out.println(sum);

    }
}