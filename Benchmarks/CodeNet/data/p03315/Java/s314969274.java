import java.util.Scanner;

class Main{
    public static long down_c(long index, long k){
        long counter = 0;
        while(true){
            counter++;
            index -= k-1;
            if(index <= 1)break;
        }
        return counter;
    }
    public static long up_c(long index, long k, long n){
        long counter = 0;
        while(true){
            counter++;
            index += k-1;
            if(index >= n)break;
        }
        return counter;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        if(n == k){
            System.out.println(1);
            System.exit(0);
        }
        long x;
        long index = 1;
        long counter = 0;
        while(true){
            x = scanner.nextLong();
            if(x == 1)break;
            index++;
        }
        if(index == 1)counter += up_c(index, k, n);
        else if(index == n)counter += down_c(index, k);
        else{
            counter += up_c(index, k, n);
            counter += down_c(index, k);
        }
        System.out.println(counter);
    }
}
