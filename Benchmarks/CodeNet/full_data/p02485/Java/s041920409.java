import java.util.Scanner;

class Aoj10019 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x;

        for (x = input.nextInt(); x != 0; x = input.nextInt()){
            int sum = 0;

            for (int i = 0; x > 0; i++){
                sum += x % 10;
                x /= 10;
            }
            System.out.println(sum);
        }
    }
}