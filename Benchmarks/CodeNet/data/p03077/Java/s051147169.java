import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        long minimum = sc.nextInt();
        for(int i = 0; i < 4; i++){
            int pathNum = sc.nextInt();
            if(minimum > pathNum){
                minimum = pathNum;
            }
        }
        System.out.println((total / minimum) + 5);
    }
}
