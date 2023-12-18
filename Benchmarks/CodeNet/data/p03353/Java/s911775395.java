import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        if(s.length() == 1) {
            System.out.println(s);
        } else {
            ArrayList<String> sub = new ArrayList<>();

            for(int i = 0; i <= s.length(); i++) {
                for(int j = i + 1; j <= s.length(); j++) {
                    sub.add(s.substring(i, j));
                    // System.out.println(s.substring(i, j));
                }
            }

            ArrayList<String> list = new ArrayList<>();

            for(int i = 0; i < sub.size(); i++) {
                if(!list.contains(sub.get(i))) {
                    list.add(sub.get(i));
                }
            }

            Collections.sort(list);
            String ans = list.get(k-1);

            // System.out.println(list.size());
            System.out.println(ans);
        }
    }
}