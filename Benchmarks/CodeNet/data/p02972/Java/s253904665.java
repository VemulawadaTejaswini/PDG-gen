import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> aList = new ArrayList();
        for (int i = 1; i <= n; i++) {
            aList.add(sc.nextLong());
        }

        List<Long> resultList = new ArrayList();
        boolean minusFlg = false;
        for(int i = n - 1; i>=0; i--) {
            if (i % 2 == 0) {
                long temp = i + 1;

                List<Long> tempAList = resultList.stream().filter(r -> r % temp == 0).collect(Collectors.toList());
                long tempSum = 0L;
                for(long t: tempAList) {
                    tempSum += t;
                }
                if (aList.get(i) == 0) {
                    if (tempSum % 2L != 0l) {
                        resultList.add(temp);
                    };
                } else {
                    if (tempSum % 2L == 0l) {
                        resultList.add(temp);
                    };
                }
            } else {
                if(aList.get(i) == 1) {
                    minusFlg = true;
                    break;
                }
            }
        }
        if(minusFlg) {
            System.out.print(-1);
        } else if (resultList.isEmpty()) {
            System.out.print(0);
        } else {
            resultList.stream().sorted().forEach(r-> System.out.print(r + " "));
        }
    }
}