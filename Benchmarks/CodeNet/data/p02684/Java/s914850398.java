import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] Az = new int[N];
        for (int i = 0; i < N; i++){
            Az[i] = sc.nextInt() - 1;
        }

        List<Integer> numList = new ArrayList<Integer>();

        int[] doneAz = new int[N];
        doneAz[0] = 1;

//        int roop = 0;
        int rootIdx = 0;
        int roopStart = 0;
//        for (int i = 0; i < N; i++){
        int next = 0;
        int beforeRoopCnt = 0;
        while (true){
//            System.out.println("next: "+next);
            beforeRoopCnt++;
            if (doneAz[Az[next]] == 0){
                doneAz[Az[next]] = 1;
            } else if (Az[next] == 0) {
//                roopStart = 0;
                rootIdx = 0;
                break;
            } else {
                rootIdx = Az[next];
//                rootIdx = next;
                break;
            }
            next = Az[next];
        }
//        System.out.println("beforeRoopCnt "+beforeRoopCnt);
//        System.out.println("rootIdx "+rootIdx);
//        int next = rootIdx;
        next = rootIdx;
//        roopStart = rootIdx;
        int cnt = 0;
        int alreadyFlg = 0;
        while (true) {
//            System.out.println("next "+next);
            next = Az[next];
            cnt++;
//            if ((next == rootIdx) && (alreadyFlg == 0)){
//
//            }
            if (next == rootIdx){
                break;
            }
        }

        beforeRoopCnt = beforeRoopCnt - cnt;
//        System.out.println("cnt "+cnt);
//        System.out.println("beforeRoopCnt "+beforeRoopCnt);
        int ans = (int) ((K - beforeRoopCnt) % cnt) + 1;
//        System.out.println(ans);
        System.out.println(ans + 1);

//        rootIdx = numList.indexOf(roop);
//        System.out.println(numList.size() - rootIdx);
//        System.out.println("aaa> "+numList.size()+" "+rootIdx);

    }
}