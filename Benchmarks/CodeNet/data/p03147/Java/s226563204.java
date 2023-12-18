import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 入力されたNを変数に格納する
        int n = console.nextInt();
        console.nextLine();

        // 理想の状態、現状、それらの差分をそれぞれリストに格納する
        List<Integer> expectedHeights = new ArrayList<>(n);
        List<Integer> currentHeights = new ArrayList<>(n);
        List<Integer> differences = new ArrayList<Integer>(n);
        for(int i = 0; i < n; i++){
            currentHeights.add(0);
            differences.add(0);
            expectedHeights.add(console.nextInt());
        }

        // 水やり操作を行う。またその回数をカウントする
        int count = 0;
        int beginIndex = -1;
        int endIndex = -1;

        while(true){
            differences = getDifferences(expectedHeights, currentHeights);
            beginIndex = getRange(differences)[0];
            endIndex = getRange(differences)[1];
            if(beginIndex == -1){
                break;
            }else{
                count++;
                for(int i = beginIndex; i <= endIndex; i++){
                    currentHeights.set(i, currentHeights.get(i) + 1);
                }
            }
        }
        System.out.println(count);
    }

    public static List<Integer> getDifferences(List<Integer> expectedHeights, List<Integer> currentHeights){
        int arraySize = expectedHeights.size();
        List<Integer> differences = new ArrayList<Integer>(arraySize);

        for(int i = 0; i < arraySize; i++){
            differences.add(expectedHeights.get(i) - currentHeights.get(i));
        }
        return differences;
    }

    public static int[] getRange(List<Integer> differences){
        int[] answer = new int[2];
        int beginIndex = -1;
        int endIndex = -1;
        boolean isBegin = true;

        for(int i = 0; i < differences.size(); i++){
            int num = differences.get(i);
            if(isBegin && num > 0){
                beginIndex = i;
                endIndex = i;
                isBegin = false;
            }else if(!isBegin && num > 0){
                endIndex = i;
            }else if(isBegin && num == 0){
                continue;
            }else if(!isBegin && num == 0){
                break;
            }
        }

        answer[0] = beginIndex;
        answer[1] = endIndex;
        return answer;
    }
}
