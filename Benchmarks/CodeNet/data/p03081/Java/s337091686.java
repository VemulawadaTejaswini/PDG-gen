import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = "0" + sc.next() + "0";
        boolean[] directions = new boolean[q];
        char[] chars = new char[q];
        for (int i = 0; i < q; i++) {
            chars[i] = sc.next().charAt(0);
            directions[i] = sc.next().equals("R");
        }
        boolean[] outputs = new boolean[n + 2];
        List<Integer> trueIndex = new ArrayList<>();
        outputs[0] = true;
        outputs[n + 1] = true;
        trueIndex.add(0);
        trueIndex.add(n + 1);
        int tmp;
        int size;
        for (int i = q; i > 0; i--) {
            size = trueIndex.size();
            if (directions[i - 1]) {
                for (int j = 0; j < size; j++) {
                    tmp = trueIndex.get(j);
                    if (tmp != 0 && chars[i - 1] == s.charAt(tmp - 1) && !outputs[tmp - 1]) {
                        outputs[tmp - 1] = true;
                        trueIndex.add(tmp - 1);
                    }

                }
            } else {
                for (int j = 0; j < size; j++) {
                    tmp = trueIndex.get(j);
                    if (tmp != n + 1 && chars[i - 1] == s.charAt(tmp + 1) && !outputs[tmp + 1]) {
                        outputs[tmp + 1] = true;
                        trueIndex.add(tmp + 1);
                    }

                }
            }

        }
        System.out.println(n - trueIndex.size() + 2);
    }
}