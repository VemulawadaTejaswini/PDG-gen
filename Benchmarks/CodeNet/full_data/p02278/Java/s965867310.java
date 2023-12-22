import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(), r = 0;
        int arr[][] = new int[size][2];
        for(int i = 0; i < size; i++){
            arr[i][0] = scan.nextInt(); arr[i][1] = i;
        }
        int arrsorted[][] = arr.clone();
        Arrays.sort(arrsorted, Comparator.comparing((int[] iarr) -> iarr[0]));
        for(int i = size - 1; 0 <= i; i--)
            if(arr[i][1] != arrsorted[i][1]){
                r += arr[i][0] + arr[arrsorted[i][1]][0];
                arr[arrsorted[i][1]] = arr[i];
                arr[i][1] = arrsorted[i][1];
                arr[i] = arrsorted[i];
                arr[i][1] = i;
            }
        System.out.println(r);
    }
}