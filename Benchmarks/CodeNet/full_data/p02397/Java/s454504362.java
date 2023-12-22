import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            String str = input.nextLine();
            String[] str1 = str.split(" ");
            int x = Integer.parseInt(str1[0]);
            int y = Integer.parseInt(str1[1]);
            if(x==0 && y==0){
                break;
            }else{
                int[] output = {x,y};
                Arrays.sort(output);
                System.out.println(output[0] + " " + output[1]);
            }
            

        }
    }
}
