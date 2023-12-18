import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static long modulus = (long) (1e9 + 7);

    private static ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        int N = readInt();

        arrayList = new ArrayList<>(N);

        for(int i=0; i<N; i++){
            arrayList.add(readInt()-(i+1));
        }

        Collections.sort((arrayList));

        int target_index = (N-1)/2;
        int target_num = arrayList.get(target_index);

        long ans = 0;
        for(int num: arrayList){
            ans += Math.abs(num - target_num);
        }
        System.out.println(ans);

    }



    private static int readInt(){
        return Integer.parseInt(sc.next());
    }

    private static long readLong(){
        return Long.parseLong(sc.next());
    }

}