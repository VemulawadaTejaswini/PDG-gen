import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        // ビンゴの値を保持
        List<Integer> bingoList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int bingoNum = scan.nextInt();
            bingoList.add(i,bingoNum);
        }
        
        // 選択された値の個数を保持
        int quantity = scan.nextInt();
        // 選択された値を保持
        List<Integer> chosedNumList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            chosedNumList.add(scan.nextInt());
        }
        
        List<Integer> positionList = new ArrayList<>();
        for (Integer value : chosedNumList) {
            if (bingoList.contains(value)) {
                int position = bingoList.indexOf(value);
                positionList.add(position);
            }
        }
        Collections.sort(positionList);
        
        
        if (positionList.contains(0) && positionList.contains(1) && positionList.contains(2)){
            System.out.println("Yes");
        } else if (positionList.contains(0) && positionList.contains(3) && positionList.contains(6)) {
            System.out.println("Yes");
        } else if (positionList.contains(0) && positionList.contains(4) && positionList.contains(8)) {
            System.out.println("Yes");
        } else if (positionList.contains(1) && positionList.contains(4) && positionList.contains(7)) {
            System.out.println("Yes");
        } else if (positionList.contains(2) && positionList.contains(4) && positionList.contains(6)) {
            System.out.println("Yes");
        } else if (positionList.contains(2) && positionList.contains(5) && positionList.contains(8)) {
            System.out.println("Yes");
        } else if (positionList.contains(3) && positionList.contains(4) && positionList.contains(5)) {
            System.out.println("Yes");
        } else if (positionList.contains(6) && positionList.contains(7) && positionList.contains(8)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}