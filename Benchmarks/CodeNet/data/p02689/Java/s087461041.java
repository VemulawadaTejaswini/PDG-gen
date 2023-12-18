import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //1行目
        String tmpLine = scan.nextLine();
        Integer intN = Integer.valueOf(tmpLine.substring(0, tmpLine.indexOf(" ")));
        // Integer intM = Integer.valueOf(tmpLine.substring(tmpLine.indexOf(" ") + 1));

        int[] highArr = new int[intN + 1];

        //2行目
        tmpLine = scan.nextLine();
        String[] sList = tmpLine.split(" ");
        for (int i = 0; i < sList.length; i++) {
            highArr[i + 1] = Integer.valueOf(sList[i]);
        }

        //3行目以降
        List<Integer> retList = new ArrayList<Integer>();
        for(int k=1; k<=intN; k++){
            retList.add(k);
        }
        while (scan.hasNext()) {
            tmpLine = scan.nextLine();
            Integer intLeft = Integer.valueOf(tmpLine.substring(0, tmpLine.indexOf(" ")));
            Integer intRight = Integer.valueOf(tmpLine.substring(tmpLine.indexOf(" ") + 1));
            if(highArr[intLeft] < highArr[intRight]) {
                if(retList.contains(intLeft)) {
                    retList.remove(retList.indexOf(intLeft));
                }
            } else if (highArr[intLeft] > highArr[intRight]) {
                if(retList.contains(intRight)) {
                    retList.remove(retList.indexOf(intRight));
                }
            }
        }

        scan.close();
        // 結果
        System.out.println(retList.size());
    }
}
