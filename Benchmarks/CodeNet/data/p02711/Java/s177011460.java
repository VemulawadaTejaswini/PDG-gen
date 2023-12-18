import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean flag = true;
        String[] num = in.nextLine().split("");
        for(int i = 0; i <= 2; i++){
            if(num[i].equals("7")){
                System.out.print("Yes");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.print("No");
        }
    }

}