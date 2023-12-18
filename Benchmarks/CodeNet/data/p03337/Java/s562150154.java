import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] arr = new int[]{a+b, a-b, a*b};
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}