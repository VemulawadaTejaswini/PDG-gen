import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                long val1=scan.nextInt();
                long val2=scan.nextInt();
                System.out.println(val1/val2+" "+val1%val2+" "+(double)val1/val2);
        }
}