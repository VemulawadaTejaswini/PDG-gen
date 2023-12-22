import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n, tmp, max;
            LinkedList<Integer> list;
            while (true) {
                n = Integer.parseInt(br.readLine());
                if (n == 0) {
                    System.exit(0);
                }

                list = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                    list.add(Integer.parseInt(br.readLine()));
                }

                for (int i = 0; i < list.size() - 1; i++) {
                    while (true) {
                        if (list.get(i) * list.get(i + 1) > 0) {
                            list.set(i, list.get(i) + list.get(i + 1));
                            list.remove(i + 1);
                            if (i + 1 == list.size()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }

                if (list.get(0) < 0) {
                    list.remove(0);
                }

                if (list.get(list.size() - 1) < 0) {
                    list.remove(list.size() - 1);
                }

                int x = 0;
                while (true) {
                    if (list.size() == 1) {
                        break;
                    }
                    if (list.get(x + 1) + list.get(x) >= 0 && list.get(x + 2) + list.get(x + 1) >= 0) {
                        list.set(x, list.get(x) + list.get(x + 1) + list.get(x + 2));
                        list.remove(x + 1);
                        list.remove(x + 1);
                        continue;
                    } else {
                        x += 2;
                    }
                    if (x >= list.size() - 1) {
                        break;
                    }
                }

                max = 0;
                for (int i = 0; i < list.size(); i += 2) {
                    tmp = 0;
                    for (int j = i; j < list.size(); j++) {
                        tmp += list.get(j);
                        if (list.get(j) > 0 && tmp > max) {
                            max = tmp;
                        }
                    }
                }
                System.out.println(max);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}