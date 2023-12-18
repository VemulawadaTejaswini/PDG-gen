import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = 100;
        double num = scan.nextDouble();
        int i = 0;
        while(true){
            a = a + (a/100);
            i++;
            if(a >= num){
                System.out.println(i);
                break;
            }
             
        }      
    }
}
