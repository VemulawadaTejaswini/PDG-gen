import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int small = Integer.parseInt(input[0]);
        int large = Integer.parseInt(input[1]);
        int range = Integer.parseInt(input[2]);
        if(large - small <= range * 2){
            for(int i = small ; i <= large ; i++){
                System.out.println(i);
            }
        }
        else{
            for(int i = small ; i <= small + range -1 ; i++){
                System.out.println(i);
            }
            for(int i = large - range + 1 ; i <= large ; i++){
                System.out.println(i);
            }
        }
    }
}
