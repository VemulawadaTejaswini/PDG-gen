import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n == 0 && x == 0){
                break;
            }
            int count = 0;
            for(int i = 1;i <= n-2; i++){
                for(int j = i+1; j <= n-1; j++){
                    int k = x - i - j;
                    if(k >= 1 && k <= n && k != i && k != j && j < k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
