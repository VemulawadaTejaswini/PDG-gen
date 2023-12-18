import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int n;

    public static boolean[] checked_size;

    public static void initialize(){
        checked_size = new boolean[1000000001];
    }

    public static boolean check(int size, int index){

        if(!checked_size[size]) {

            checked_size[size] = true;

            int[] h = new int[arr.length];
            System.arraycopy(arr, 0, h, 0, h.length);

            h[index] = -1;
            int count = 1;


            for (int i = 0; i < n; i++) {
                if (h[i] != 0 && h[i] != -1) {
                    if (arr[i] < 2 * size) {
                        h[i] = 0;
                        count++;
                        size = size + arr[i];
                    }
                }
            }

            h = null;

            if (count == n) return true;
            else return false;
        }
        else
            return false;  // if a size has been checked before, and the algorithm goes forward to check it again
                           // that means the size was false (not possible at the end) and
                          // we can reduce the computations by not checking it again.

    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        n = inp.nextInt();
        arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        Arrays.sort(arr);

        initialize();

        int ans = n;
        //System.out.println("Input success.");

        for(int i=0; i<n; i++){
            if(check(arr[i],i)){
                ans = n - i;
                break;
            }
        }

        System.out.println(ans);


    }
}
