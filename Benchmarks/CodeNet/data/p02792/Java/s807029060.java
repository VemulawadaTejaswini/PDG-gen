import java.util.Scanner;

class Main {
    static int firstDigit(int num){
        while(num>=10){
            num/=10;
        }
        return num;
    }
    static int lastDigit(int num){
        if(num>=10){
            num = num%10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int count = 0;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if(firstDigit(i)==lastDigit(j)&&lastDigit(i)==firstDigit(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
        s.close();
    }
}