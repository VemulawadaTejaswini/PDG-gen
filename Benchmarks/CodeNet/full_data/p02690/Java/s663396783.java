import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i = -100;i < 101;i++){
            for(int j = -100 ; j < 101;j++){
                if(Math.pow(i, 5) - Math.pow(j, 5) == target){
                    System.out.println(i + " " + j);
                    System.exit(0);
                }
            }
        }
    }
}