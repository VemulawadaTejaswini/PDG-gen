import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int array1[] = new int[5];
        int array2[] = new int[5];
        List<String> slist = new ArrayList<>();
        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        //処理
        String siro = ".";//白
        String kuro = "#";//黒
        String ss = "";
        int point = 0;
        int bcount = 0;
        for (int i = 0; i < N; i++) {
            ss = S.substring(i, i + 1);
            if (ss.equals("#")) {
                point = i;
                break;

            }
        }
        for (int i = point; i < N; i++) {
            ss = S.substring(i, i + 1);
            if (ss.equals(siro)) {
                count++;
            } else {
                bcount++;
            }
        }


        if (count == N) {
            count = 0;
        }else if (count > bcount)
        {
            answer=bcount;
        }else
        {
            answer=count;
        }

        //System.out.println(test);
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}