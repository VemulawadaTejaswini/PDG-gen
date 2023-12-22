
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] capacityBox = new int[n];
        int[] amountEach = new int[n];
        boolean isPossible = true;
        Arrays.fill(amountEach,0);
        for (int i=0; i<n; i++){
            capacityBox[i] = scanner.nextInt();
        }
        int numberInstructions = scanner.nextInt();
        for (int i=0 ; i< numberInstructions; i++){
           int t = scanner.nextInt();
           int x = scanner.nextInt();
           int d = scanner.nextInt();

           if (t == 1){
               amountEach[x-1] += d;
           }else {
               amountEach[x-1] -= d;
           }
           if (amountEach[x-1] > capacityBox[x-1] || amountEach[x-1] <0){
               isPossible = false;
               System.out.println(x);
               break;
           }

        }
        if(isPossible){
            System.out.println(0);
        }
    }
}

