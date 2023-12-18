
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner cin = new Scanner(System.in);
        //Scanner cin = new Scanner(new FileReader("src\\AtcoderContest0721\\task2-test-input.txt"));

        int islandNum = cin.nextInt();
        int len = cin.nextInt();

        int[][] req = new int[len][2];
        for (int i=0;i<len;i++) {
            req[i][0] = cin.nextInt();
            req[i][1] = cin.nextInt();
        }

        Integer[] count = new Integer[islandNum-1];
        for (int i=0;i<count.length;i++){
            count[i] = 0;
        }
        for (int i=0;i<len;i++){
            for (int j=req[i][0]-1;j<req[i][1]-1;j++){
                count[j]+=1;
            }
        }

        int[] used = new int[len];
        int res = 0;
        while (true) {
            int sumCount = 0;
            for (int i=0;i<used.length;i++){
                sumCount += used[i];
            }
            if (sumCount==len) break;

            int maxBreak = Collections.max(Arrays.asList(count));
            int maxBreakIndex = Arrays.asList(count).indexOf(maxBreak)+1;
            //System.out.println(maxBreakIndex);

            for (int i=0;i<len;i++){
                if (maxBreakIndex>=req[i][0]&&maxBreakIndex<req[i][1]&&used[i]==0){
                        for (int j=req[i][0]-1;j<req[i][1]-1;j++){
                            count[j]--;
                        }
                    used[i] = 1;
                    //System.out.println(req[i]);
                }
            }
            //System.out.println(res);
            res++;
        }
        System.out.println(res);

    }
}