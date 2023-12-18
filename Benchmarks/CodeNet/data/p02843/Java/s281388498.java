import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        List<Integer> products = new ArrayList<>(Arrays.asList(100, 101, 102, 103, 104, 105));
        List<Integer> p = IntStream.rangeClosed(0, target).map(e -> e == 0 ? e : -1).boxed().collect(Collectors.toList());
        for (int m: products) {
            for (int i = target; i >= 0; i--) {
                // 3. 配列pを最後から見ていき、-1 以外の時に、4の処理を行う
                if (p.get(i) == -1)
                    continue;
                // 4. i + m <= target で、_work[i+m] == -1 ならば、_work[i+m] に m を代入する。
                if (i + m <= target && p.get(i + m) == -1)
                    p.set(i + m, m);
            }
            // 5. _work[target] != -1 ならば、解が見つかったので、処理を終了する。
            //    _work[target] == -1 ならば 1.に戻って処理を繰り返す。
            if (p.get(target) != -1)
                break;
        }

        List<Integer> result = new ArrayList<>();
        if (p.get(target) != -1) {
            while (target > 0) {
                result.add(p.get(target));
                target = target - p.get(target);
            }
        }
        System.out.println(result.size() > 0 ? 1 : 0);
    }
}
