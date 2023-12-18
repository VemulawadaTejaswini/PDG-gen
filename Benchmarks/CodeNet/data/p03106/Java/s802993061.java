import java.util.*;

class CommonDivisor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int countA = 0;
        int countB = 0;
        int arrayCountA = 0;
        int arrayCountB = 0;


        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                countA++;
            }
        }

        for(int i = 1; i <= b; i++){
            if(b % i == 0){
                countB++;
            }
        }

        if(arrayCountA != 0 && arrayCountB != 0){
            int[] divisorA = new int[countA];
            int[] divisorB = new int[countB];

            for(int i = 1; i <= a; i++){
                if(a % i == 0){
                    divisorA[arrayCountA] = i;
                    arrayCountA++;
                }
            }

            for(int i = 1; i <= b; i++){
                if(b % i == 0){
                    divisorB[arrayCountB] = i;
                    arrayCountB++;
                }
            }
            System.out.println(divisorA[k]);
        }else{
            System.out.println(countA);
        }
    }   
}