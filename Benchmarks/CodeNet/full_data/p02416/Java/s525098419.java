import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String number = null;
        while(input.hasNext()){
            number = input.nextLine();
            char[] num = number.toCharArray();
            int sum = 0;
            if(num.length != 1 || num[0] != '0') {
                for(int i = 0; i < num.length; i ++)
                    sum += (num[i] - '0');
                System.out.println(sum);
            }
        }
    }
}
