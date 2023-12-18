import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int total = 0;

        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            total = total + A[i];
        }

        int count = 0;
        for(int i=0;i<N;i++){
            if (A[i] >= (total * 0.25/ M)){
                count++;
            }
        }

        if(count>=M){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}