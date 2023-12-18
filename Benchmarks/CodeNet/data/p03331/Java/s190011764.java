import java.util.*;

class digitsum{
    public static void main(String[] args){
        int n, j, sum = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i < n; i++){
            j = n - i;
            //System.out.println(i + ", " + j + ", ");
            sum = sumDigits(i) + sumDigits(j);
            if(i == 1){
                min = sum;
            }
            if(min > sum){
                min = sum;
            }

        }
        System.out.println(min);
    }
    static public int sumDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}