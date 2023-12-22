import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int w = input.nextInt();
        int h = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int r = input.nextInt();
        String result = "Yes";

        if(x - r < 0 || x+r > w){
            result = "No";
        }
        if(y - r < 0 || y+r > h){
            result = "No";
        }

        System.out.println(result);

    }}
