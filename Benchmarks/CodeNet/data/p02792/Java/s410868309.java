import java.util.Scanner;

class Main {
    static long firstDigit(long num){
        while(num>=10){
            num/=10;
        }
        return num;
    }
    static long lastDigit(long num){
        if(num>=10){
            num = num%10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long number = s.nextInt();
        long count = 0;
        for(long i=1;i<=number;i++){
            for(long j=1;j<=number;j++){
                if(firstDigit(i)==lastDigit(j)&&lastDigit(i)==firstDigit(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
        s.close();
    }
}