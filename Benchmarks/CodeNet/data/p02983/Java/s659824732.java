import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong() % 2019;
        long r = scanner.nextLong() % 2019;
        long min = Long.MAX_VALUE;
        if(l-r >= 2018){System.out.println(0);return;}
        for(long i = l; i <= r; i++){
            for(long j = i+1; j <= r; j++){
                if (i == j) continue;
                min = Math.min(min, (i*j)%2019);
            }
        }
        System.out.println(min);
    }
}

