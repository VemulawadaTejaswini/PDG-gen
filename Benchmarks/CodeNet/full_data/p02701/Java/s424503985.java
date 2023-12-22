import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> PrizeList = new ArrayList<>();
        int num = sc.nextInt();
        for(int i = 0;i < num;i++){
            sc = new Scanner(System.in);
            String Prize = sc.nextLine();
            if(!PrizeList.contains(Prize)){
                PrizeList.add(Prize);
            }
        }
        System.out.println(PrizeList.size());
    }
}