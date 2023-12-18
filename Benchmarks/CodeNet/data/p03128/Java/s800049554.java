import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int msCount = sc.nextInt();
        int usableNumberCount = sc.nextInt();
        List<Integer> usableNumbers = new ArrayList<Integer>();
        for (int i = 0; i < usableNumberCount; i++) {
            usableNumbers.add(sc.nextInt());
        }
        usableNumbers.sort(Comparator.naturalOrder());
        int[] msCountToUse = new int[]{0,2,5,5,4,5,6,3,7,6};
        
        int basicNumber = getLowestCostNumber(usableNumbers);
        int[] answer = new int[msCount / msCountToUse[basicNumber]];
        Arrays.fill(answer, basicNumber);
        int nowMSCount = msCountToUse[basicNumber] * answer.length;
        
        int n = usableNumbers.size();
        int answerIndex = 0;
        int msBN = msCountToUse[basicNumber];
        List<Integer> tmp = new ArrayList<Integer>();
        
        int tmpNum = -1;
        
        for (int unIndex = n - 1; unIndex >= 0; unIndex--) {
            int num = usableNumbers.get(unIndex);
            int msNum = msCountToUse[num];
            boolean msCountOver = msNum - msBN + nowMSCount > msCount;
            boolean justArrive = msNum - msBN + nowMSCount == msCount;
            
            if (msCountOver) continue;
                
            if (justArrive || num > basicNumber) {
                tmp.add(num);
                nowMSCount += msNum - msBN;
                if (nowMSCount == msCount) {
                    break;
                }
                unIndex = n;
                answerIndex++;
            } else if (num < basicNumber) {
                tmpNum = num;
                continue;
            }
            
            if (unIndex == 0) {
                tmp.add(tmpNum);
                nowMSCount += msCountToUse[tmpNum] - msBN;
                unIndex = n;
                answerIndex++;
            }
        }
        
        tmp.sort(Comparator.reverseOrder());
        
        boolean passed = false;
        for (int i = 0; i < tmp.size(); i++) {
            int num = tmp.get(i);
            if (num > basicNumber) {
                System.out.print(num);
                if (i == tmp.size() - 1) {
                    int j = msCount / msBN - tmp.size();
                    while (j-- > 0) {
                        System.out.print(basicNumber);
                    }
                }
            } else {
                if (!passed) {
                    int j = msCount / msBN - tmp.size();
                    while (j-- > 0) {
                        System.out.print(basicNumber);
                    }
                    passed = true;
                    System.out.print(num);
                } else {
                    System.out.print(num);
                }
            }
        }
        System.out.println();
    }
    
    public static int getLowestCostNumber(List<Integer> usableNumbers) {
        if (usableNumbers.contains(1)) return 1;
        if (usableNumbers.contains(7)) return 7;
        if (usableNumbers.contains(4)) return 4;
        if (usableNumbers.contains(5)) return 5;
        if (usableNumbers.contains(3)) return 3;
        if (usableNumbers.contains(2)) return 2;
        if (usableNumbers.contains(9)) return 9;
        if (usableNumbers.contains(6)) return 6;
        // if (usableNumbers.contains(8))
        return 8;
    }
}
