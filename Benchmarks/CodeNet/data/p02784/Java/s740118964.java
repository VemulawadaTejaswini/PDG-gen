import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        // System.out.println(input);
        String[] inputs = input.split(" ", 0);
        String[] inputs2 = input2.split(" ", 0);
        int hp = Integer.parseInt(inputs[0]);
        int iter = Integer.parseInt(inputs[1]);
        boolean hantei = false;
        for(int i = 0; i < iter; i++){
            int attack = Integer.parseInt(inputs2[i]);
            hp -= attack;
            if(hp <= 0){
                break;
            }
        }
        if(hp > 0){
            hantei = true;
        }
        if(hantei){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}