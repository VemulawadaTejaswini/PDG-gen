import java.util.*;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < n; ++i){
            int e = sc.nextInt();
            array.add(e);
        }
        int ans = 0;
        for(int i = 1; i < n-1; ++i){
            if((array.get(i-1) < array.get(i) && array.get(i) < array.get(i+1))
             ||(array.get(i-1) > array.get(i) && array.get(i) > array.get(i+1))){
                ++ans;
            }
        }
        System.out.print(ans);
    }
}