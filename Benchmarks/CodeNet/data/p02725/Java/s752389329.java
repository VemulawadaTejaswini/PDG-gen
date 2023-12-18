import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLength = sc.nextInt();
        int totalHouse = sc.nextInt();
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        ArrayList<Integer> plusTotallengths = new ArrayList<Integer>();
        for (int i = 0; i < totalHouse; i++){
            int temp = sc.nextInt();
            lengths.add(temp);
            plusTotallengths.add(temp + totalLength);
        }
        int firstToEnd = lengths.get(totalHouse - 1) - lengths.get(0);
        int viaNorth = plusTotallengths.get(totalHouse - 2) - lengths.get(totalHouse - 1);

        if(firstToEnd < viaNorth){
            System.out.println(firstToEnd);
        } else {
            System.out.println(viaNorth);
        }
    }
}
