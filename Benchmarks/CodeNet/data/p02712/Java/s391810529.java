import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }


    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        long sum = 0;
        for(int i=1; i<= N; i++){
            if(i % 3 == 0){
            }
            else if(i % 5 == 0){
            }
            else if(i % 15 == 0){
            }
            else {
                sum = sum + i;
            }
        }

        System.out.println(sum);


    }
}    

