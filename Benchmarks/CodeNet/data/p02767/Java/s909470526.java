import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sc1 = Integer.parseInt(scanner.nextLine());
        String array[] = (scanner.nextLine().split(" ")); 
        double sum = 0;
        for( int i=0; i<sc1; i++ ) {
                sum += Integer.parseInt(array[i]);
        }
        double ave = Math.round(sum/sc1);
        double sum2 = 0;
        for( int i=0; i<sc1; i++ ) {
                sum2 += Math.pow(Integer.parseInt(array[i]) - ave,2);
        }
        System.out.println((int)sum2);
    }
}