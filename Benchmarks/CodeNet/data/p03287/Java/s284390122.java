import java.util.Scanner;

public class Candy_Distribution{
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
        int r = 0;
        int j,l;
        long total;

        while(r < N){
            j = 0;
            while(j < r+1){
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
                j++;
            }
            r++;
        }
        System.out.println(count);
    }
}