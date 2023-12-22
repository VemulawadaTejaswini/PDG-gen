import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        //System.out.println(maxPoint(array));
        //System.out.println(minPoint(array));
        System.out.println(cal(array));
    }

    static int cal(int[] array){
        int ans = -1000000000;
        int max_p = maxPoint(array);
        int min_p = minPoint(array);

        if(max_p > min_p){
            for(int i=min_p; i <= max_p; i++){
                if(i > 1){
                    if(array[i] > array[i-1]) continue;
                }
                for(int j=i+1; j <= max_p; j++){
                    if(array[j ] -array[i] > ans) ans = array[j] - array[i];
                }
            }
        }else{
            for(int i=min_p; i < array.length; i++){
                if(i > 1){
                    if(array[i] > array[i-1]) continue;
                }
                for(int j=i+1; j < array.length; j++){
                    if(array[j ] -array[i] > ans) ans = array[j] - array[i];
                }
            }
            for(int i=0; i < max_p; i++){
                if(i > 1){
                    if(array[i] > array[i-1]) continue;
                }
                for(int j=i+1; j < max_p; j++){
                    if(array[j ] -array[i] > ans) ans = array[j] - array[i];
                }
            }
        }
        return ans;
    }

    static int maxPoint(int[] array){
        int max_p = 0;
        for(int i=0; i < array.length-1; i++){
            if(array[max_p] < array[i+1]) max_p = i+1;
        }
        return max_p;
    }

    static int minPoint(int[] array){
        int min_p = 0;
        for(int i=0; i < array.length-1; i++){
            if(array[min_p] > array[i+1]) min_p = i+1;
        }
        return min_p;
    }

}