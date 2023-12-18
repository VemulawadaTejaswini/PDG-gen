import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        List<Integer> shiseiList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            int value = Character.getNumericValue(s.charAt(i));
            shiseiList.add(value);
        }

        List<Integer> changePointList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if (i == 0){
                changePointList.add(i);
            }else {
                if (!shiseiList.get(i).equals(shiseiList.get(i - 1))){
                    changePointList.add(i);
                }
            }
        }
        // end point
        changePointList.add(n);
        int changeSize = changePointList.size();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < changeSize - 1; i++){
            int shisei = shiseiList.get(changePointList.get(i));
            if (shisei == 1){
                int endIndex = Math.min(i + k * 2 + 1, changeSize - 1);
                answerList.add(changePointList.get(endIndex) - changePointList.get(i));
            }else {
                int endIndex = Math.min(i + 2 * k, changeSize - 1);
                answerList.add(changePointList.get(endIndex) - changePointList.get(i));
            }
        }

        answerList.sort(Comparator.reverseOrder());

        System.out.println(answerList.get(0));

    }

}