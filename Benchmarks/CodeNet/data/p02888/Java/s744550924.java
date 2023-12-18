import java.util.*;

class Main{
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stick = new int[n];
        for(int i = 0; i < n; i++){
            stick[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(stick);
        int sum = 0;
        for(int i = 0; i < n; i ++){
            for(int j = i + 1; j < n; j++){
                int len = stick[i] + stick[j];
                int cur = search(stick, len);
                sum += cur - j;
                
            }
        }
        System.out.println(sum);
        
    }
    private static int search(int[] stick, int len){
        int left = 0;
        int right = stick.length;
        while(!(right - left == 1)){
            int mid = (left + right) / 2;
            if(stick[mid] < len){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }
}