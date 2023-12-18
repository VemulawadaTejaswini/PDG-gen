import java.util.*;

class Main {
    int D, G;
    int solved;
    int sum;
    
    Map<Integer, Integer> countMap;
    Map<Integer, List<Integer>> problemInfoMap;
    List<Integer> amountList;
    Map<Integer, Integer> amountToNumMap;
    Set<Integer> solvedNumSet;

    Main() {
        Scanner sc = new Scanner(System.in);
        this.D = Integer.parseInt(sc.next());
        this.G = Integer.parseInt(sc.next());
        this.sum = 0;
        this.solved = 0;

        this.countMap = new HashMap<>(D); // n -> p_n(remain)
        this.problemInfoMap = new HashMap<>(D); // n -> (p_n, c_n)

        // to refer from amount
        this.amountList = new ArrayList<>(D); // sort by p_n
        this.amountToNumMap = new HashMap<>(D); // p_n -> n

        // to save solved problems temporalily
        this.solvedNumSet = new HashSet<>();

        for (int i = 1; i <= D; ++i) {
            int amount = Integer.parseInt(sc.next());
            int bonus = Integer.parseInt(sc.next());

            countMap.put(i, amount);
            amountList.add(amount);

            List<Integer> info = new ArrayList<>(2);
            info.add(amount);
            info.add(bonus);
            problemInfoMap.put(i, info);

            amountToNumMap.put(amount, i);
        }

        // access from smallest amount
        Collections.sort(amountList, Collections.reverseOrder());
    }

    int getDefAmt(int n) {
        return problemInfoMap.get(n).get(0);
    }

    int getBonus(int n) {
        return problemInfoMap.get(n).get(1);
    }

    int getPoint(int n) {
        return 100 * n;
    }

    int getPointWithBonus(int n) {
        return getPoint(n) * getDefAmt(n) + getBonus(n);
    }

    void rollback() {
        for (int n : solvedNumSet) {
            countMap.put(n, getDefAmt(n));
        }
        sum = 0;
        solved = 0;
        solvedNumSet.clear();
    }

    void solve(int n) {
        solved += 1;
        solvedNumSet.add(n);
        countMap.put(n, countMap.get(n) - 1);
        sum += getPoint(n);
        if (countMap.get(n) <= 0) {
            sum += getBonus(n);
        }
    }

    void solveBiggest() {
        int target = D;
        for (int i = D; i > 0; --i) {
            if (countMap.get(i) > 0) {
                target = i;
                break;
            }
        }
        solve(target);
    }

    void solveAll(int n) {
        for (int i = 0; i < getDefAmt(n); ++i) {
            solve(n);
        }
    }

    void answer() {
        // Âü∫Êú¨„ÅØÂæóÁÇπ„ÅåÈ´ò„ÅÑÂïèÈ°å„Åã„ÇâÁ≠î„Åà„Å¶„ÅÑ„Åç„ÄÅG„Å´ÈÅî„Åó„Åü„ÅãÈÄê‰∏Ä„ÉÅ„Çß„ÉÉ„ÇØ
        // p_iÂïè„Å´ÈÅî„Åó„Åü„Çâ„ÄÅ100*i*p_i + c_i„Å®ÊØîËºÉ
        while (sum < G) {
            int size = amountList.size();
            if (size > 0) {
                int smallest_p = amountList.get(size - 1);  
                if (solved == smallest_p) {
                    amountList.remove(size - 1);
                    int n = amountToNumMap.get(smallest_p);
                    if (getPointWithBonus(n) >= sum) {
                        rollback();
                        solveAll(n);
                    }
                        
                } else {
                    solveBiggest();
                }
            } else {
                solveBiggest();
            }
        }
        System.out.println(solved);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.answer();
    }
}
