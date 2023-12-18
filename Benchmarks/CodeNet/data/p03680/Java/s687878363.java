import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] button = new int[n+1];
        for(int i = 1; i <= n; i++){
            button[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        int nextButton = 1;
        boolean success = false;
        for(int j = 0; j < n; j++){
            count++;
            nextButton = button[nextButton];
            if(nextButton == 2){
                success = true;
                break;
            }
        }
        if(!success){
            count = -1;
        }
        System.out.println(count);
    }

}