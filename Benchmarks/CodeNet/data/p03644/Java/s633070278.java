import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] count = new int[N];
        for(int i = 1; i <= N; i++){
            while(i % 2 == 0){
                i /= 2;
                count[i]++;
            }
        }

        int max = 0;
        int maxIndex = 0;
        for(int i = 1; i <= N; i++){
            if(max < count[i]){
                max = count[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);

        
    }
}