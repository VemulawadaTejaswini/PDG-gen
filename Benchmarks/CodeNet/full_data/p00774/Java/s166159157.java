import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();
        List<Integer> list5 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        while(true){
            int n = Integer.parseInt(reader.readLine());
            if(n==0){
                break;
            }

            list1 = new ArrayList<Integer>();
            list2 = new ArrayList<Integer>();
            list3 = new ArrayList<Integer>();
            list4 = new ArrayList<Integer>();
            list5 = new ArrayList<Integer>();
            for(int i=0; i<n; i++){
                String[] line = reader.readLine().split(" ");
                list1.add(0, Integer.parseInt(line[0]));
                list2.add(0, Integer.parseInt(line[1]));
                list3.add(0, Integer.parseInt(line[2]));
                list4.add(0, Integer.parseInt(line[3]));
                list5.add(0, Integer.parseInt(line[4]));
            }
            int score = 0;
            boolean change = true;
            while(change) {
                change = false;
                for (int i = 0; i < n; i++) {
                    if (list1.get(i) == list2.get(i) && list2.get(i) == list3.get(i) && list2.get(i) != null) {
                        int k = list1.get(i);
                        list1.set(i, null);
                        list2.set(i, null);
                        list3.set(i, null);
                        score += 3 * k;
                        if (list4.get(i) == k) {
                            list4.set(i, null);
                            score += k;
                            if (list5.get(i) == k) {
                                list5.set(i, null);
                                score += k;
                            }
                        }
                        change = true;
                    } else if (list2.get(i) == list3.get(i) && list3.get(i) == list4.get(i) && list3.get(i) != null) {
                        int k = list2.get(i);
                        list2.set(i, null);
                        list3.set(i, null);
                        list4.set(i, null);
                        score += 3 * k;
                        if (list5.get(i) == k) {
                            list5.set(i, null);
                            score += k;
                        }
                        change = true;
                    } else if (list3.get(i) == list4.get(i) && list5.get(i) == list4.get(i) && list3.get(i) != null) {
                        int k = list3.get(i);
                        list3.set(i, null);
                        list4.set(i, null);
                        list5.set(i, null);
                        score += 3 * k;
                        change = true;
                    }
                }
                if(change){
                    list1 = slide(list1);
                    list2 = slide(list2);
                    list3 = slide(list3);
                    list4 = slide(list4);
                    list5 = slide(list5);
                } else {
                    System.out.println(score);
                    break;
                }
            }
        }
    }

    public static List<Integer> slide(List<Integer> list) {
        for(int i=0; i<list.size(); i++){
            if(list.get(list.size()-i-1) == null){
                for(int j=list.size()-i-1; j<list.size()-1; j++){
                    list.set(j, list.get(j+1));
                }
                list.set(list.size() - 1, null);
            }
        }
        return list;
    }
}