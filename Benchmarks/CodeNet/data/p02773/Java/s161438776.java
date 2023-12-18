import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

//        sc.nextLine();
        String[] texts = new String[N];
        for (int n = 0; n < N; n++) {
            texts[n] = sc.nextLine();
        }

        HashMap<String, Integer> words = new HashMap<String, Integer>();
//        System.out.println("\n\n"+N);
        int max = 0;
        for (int n = 0; n < N; n++) {
            if (!words.keySet().contains(texts[n])){
                words.put(texts[n], 1);
            } else {
                words.put(texts[n], words.get(texts[n]) + 1);
            }

            if (max < words.get(texts[n])) max = words.get(texts[n]);
//            System.out.println(texts[n]);
//            words.add(texts[n]);
        }

        List<String> maxz = new ArrayList<String>();
//        System.out.println(max);

        for (String w:words.keySet()){
//            System.out.println(w+" "+words.get(w));
            if (max == words.get(w)){
                maxz.add(w);
            }
        }

//        List<String> sortedList = maxz.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        Collections.sort(maxz);
        for (String i: maxz){
            System.out.println(i);
        }

    }
}