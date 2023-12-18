import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for (int i = 0; i < 3; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                count = 1;
            }
            if (count == 3){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}