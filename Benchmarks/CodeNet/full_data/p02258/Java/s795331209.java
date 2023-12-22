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

    public static int cal(int[] array){
        int ans = -1000000000;
        int min = array[0];

        for(int i=0; i < array.length-1; i++){
            if(array[i] < min) min = array[i];
            int def = array[i+1] - min;
            if(ans < def) ans = def;
        }
        return ans;
    }
}