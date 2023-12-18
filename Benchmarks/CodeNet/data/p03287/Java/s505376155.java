import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();

        long A[] = new long[(int)N];
        int i;
        for(i = 0; i < N; i++){
            A[i] = scan.nextLong();
        }

        int count = 0;
        int r,j,l;
        long total;

        for(r = 0; r < N; r++){
            for(j = 0; j < r+1; j++){
                l = j;
                total = 0;
                while(l <= r){
                    total += A[l];
                    if(l == r){
                        if(total % M == 0){
                            count++;
                            break;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}