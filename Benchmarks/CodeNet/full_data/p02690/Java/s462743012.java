import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i = -200;i < 201;i++){
            for(int j = -200 ; j < 201;j++){
                if(Math.pow(i, 5) - Math.pow(j, 5) == target){
                    System.out.println(i + " " + j);
                    System.exit(0);
                }
            }
        }
    }
}