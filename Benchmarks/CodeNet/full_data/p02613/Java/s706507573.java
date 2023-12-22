import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> test_case = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            test_case.add(sc.nextLine());
        }
        Map<String,Integer> sum = new HashMap<>();
        sum = solve(test_case);

        System.out.println("AC x " + sum.get("AC") + "¥n"
                + "WA x " + sum.get("WA") + "¥n"
                + "TLE x " + sum.get("TLE" + "¥n"
                + "RE x " + sum.get("RE")
                ));
    }

    public static HashMap<String,Integer> solve (ArrayList<String> test_case){
        Map<String,Integer> sum = new HashMap<>();
        int ac = 0;
        int tle = 0;
        int wa = 0;
        int re = 0;
        for (String test : test_case) {
            switch(test){
                case "AC":
                    ac++;
                    sum.put("AC",ac);
                    break;
                case "TLE":
                    tle++;
                    sum.put("tle",tle);
                    break;
                case "WA":
                    wa++;
                    sum.put("WA",wa);
                    break;
                case "RE":
                    re++;
                    sum.put("RE",re);

            }
        }
        return sum;
    }

}