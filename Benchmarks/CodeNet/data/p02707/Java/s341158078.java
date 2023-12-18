import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main{
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] ls = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dic = new int[n];
        for (int i = 0; i < n; i++)
            dic[i] = 0;
        for (int i = 0; i < n - 1; i++){
            dic[ls[i] - 1]++;
        }
        for (int i = 0; i < n; i++){
            System.out.println(ls[i]);
        }
}