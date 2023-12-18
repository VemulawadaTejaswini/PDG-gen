import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int first = 0;
        String eats;
        for (int i = 0; i < 4; i++){
            eats = scan.next();
            if (eats.equals("+")){
                first++;
            }else if(eats.equals("-")) {
                first--;
            }
        }
        scan.close();
        System.out.println(first);
    }
}