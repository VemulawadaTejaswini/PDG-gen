import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] card = scan.nextLine().split("\\s");
        int alicesCard = Integer.valueOf(card[0]);
        int bobsCard = Integer.valueOf(card[1]);
        if(alicesCard == 1 || bobsCard == 1){
            if(alicesCard == 1){
                alicesCard = 14;
            }
            if(bobsCard == 1){
                bobsCard = 14;
            }
        }
        if(alicesCard == bobsCard){
            System.out.println("Draw");
        }else if(alicesCard > bobsCard){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }
    }
}