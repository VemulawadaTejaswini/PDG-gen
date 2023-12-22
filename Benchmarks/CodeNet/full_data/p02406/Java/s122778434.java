import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        output(max);
    }
    
    public static void output(int max){
        String num;
        for(int i = 3; i <= max; i ++){
            num = Integer.toString(i);
            if(i % 3 == 0 || num.contains("3")){
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
