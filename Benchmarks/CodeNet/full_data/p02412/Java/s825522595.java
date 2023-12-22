import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while(true){
            int n = num.nextInt();
            int x = num.nextInt();
            if(n == 0 && x == 0) break;
            int sum = 0;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    for(int k = 1; k <= j; k++){
                        if(i != j && i != k  && j != k && (i+j+k == x)){
                            sum++;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
