import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.valueOf(sc.nextLine());


        HashMap<Integer, Integer> kisuu_numbers = new HashMap<>();
        HashMap<Integer, Integer> guusuu_numbers = new HashMap<>();


        String[] tmp = sc.nextLine().split(" ");
        for (int i = 0; i < size; i++) {
            int num = Integer.valueOf(tmp[i]);
            if ((i + 1) % 2 == 1) {
                if (!kisuu_numbers.containsKey(num)) {
                    kisuu_numbers.put(num, 1);
                } else {
                    kisuu_numbers.put(num, kisuu_numbers.get(num) + 1);
                }
            } else {
                if (!guusuu_numbers.containsKey(num)) {
                    guusuu_numbers.put(num, 1);
                } else {
                    guusuu_numbers.put(num, guusuu_numbers.get(num) + 1);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> entries_kisuu = new ArrayList<>(kisuu_numbers.entrySet());
        List<Map.Entry<Integer, Integer>> entries_guusuu = new ArrayList<>(guusuu_numbers.entrySet());

        entries_kisuu.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        entries_guusuu.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int kakikae = -1;
        if (entries_kisuu.size() == 1 && entries_guusuu.size() == 1) {
            if (entries_kisuu.get(0).getKey().equals(entries_guusuu.get(0).getKey())) {
                kakikae = size / 2;
            } else {
                kakikae = 0;
            }
        } else {
            if (entries_kisuu.size() == 1) {
                kakikae = size - size / 2 - entries_guusuu.get(1).getValue();
            } else if (entries_guusuu.size() == 1) {
                kakikae = size - entries_kisuu.get(1).getValue() - size / 2;
            } else {
                if (!entries_kisuu.get(0).getKey().equals(entries_guusuu.get(0).getKey())) {
                    kakikae = size - entries_kisuu.get(0).getValue() - entries_guusuu.get(0).getValue();
                } else {
                    if (!entries_kisuu.get(0).getValue().equals(entries_guusuu.get(0).getValue())) {
                        if (entries_kisuu.get(0).getValue() > entries_guusuu.get(0).getValue()) {
                            kakikae = size - entries_kisuu.get(0).getValue() - entries_guusuu.get(1).getValue();
                        } else {
                            kakikae = size - entries_kisuu.get(1).getValue() - entries_guusuu.get(0).getValue();
                        }
                    } else {
                        if (entries_kisuu.get(1).getValue() > entries_guusuu.get(1).getValue()) {
                            kakikae = size - entries_kisuu.get(1).getValue() - entries_guusuu.get(0).getValue();
                        } else {
                            kakikae = size - entries_kisuu.get(0).getValue() - entries_guusuu.get(1).getValue();
                        }
                    }
                }
            }
        }
        System.out.println(kakikae);


    }
}
