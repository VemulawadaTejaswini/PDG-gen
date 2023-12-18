/**
 * Created by abhishek on 8/4/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n + 1];
        int temp[] =  new int[n + 1];
        temp[0] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(br.readLine());
            array[i] = a;
            temp[i] = a;
        }
        Arrays.sort(temp);
        for(int i = 1;i <= n;i++){
            int pos = Arrays.binarySearch(temp,array[i]);
            map.put(array[i],pos);
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int pos = map.get(array[i]);
            //System.out.println(array[i] + " " + pos + " " + i);
            if(pos >= i)continue;
            if (((i - pos) & 1) == 1) cnt++;
        }
        System.out.println((int) Math.ceil(cnt * 1.0 / 2));
    }
}
