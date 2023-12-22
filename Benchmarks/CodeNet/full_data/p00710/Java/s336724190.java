import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();

            int[] num =  new int[n];
            int[] temp =  new int[n];

            for(int i = 0; i < n; i++){
                num[i] = n - i;
            }

            if(n == 0 && r == 0) break;

            for(int i = 0; i < r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();

                for(int j = 0; j < p+c-1; j++){
                    if(j < p-1){
                        temp[j+c] = num[j];
                    }else{
                        temp[j-p+1] = num[j];
                    }
                }
                for(int j = 0; j < p+c-1; j++){
                    num[j] = temp[j];
                }
            }
            System.out.println(num[0]);
            
        }
    }
}
