import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String hats = sc.next();
        int numOfR = 0;
        int numOfB = 0;
        for(char hat: hats.toCharArray()){
            if(hat == 'R'){
                numOfR++;
            }
            else if(hat == 'B'){
                numOfB++;
            }
        }
        if(numOfR>numOfB){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}