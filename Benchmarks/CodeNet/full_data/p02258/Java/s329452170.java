import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(cal(array));
    }

    static int cal(int[] array){
        int ans=-1000000000;
        for(int i=0; i < array.length; i++){
            if(i > 1){
                if(array[i] > array[i-1]) continue;
            }
            for(int j=i+1; j < array.length; j++){
                if(array[j]-array[i] > ans) ans = array[j] - array[i];
            }
        }
        return ans;
    }
}