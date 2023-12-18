import java.util.*;

public class Main {
    Integer result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<String> inputs = new ArrayList<>();
        for(int i=0; i<m; i++) {
            inputs.add(sc.nextLine());
        }
        check(n, m, inputs);
    }

    public static void check(int n, int m, ArrayList<String> inputs) {
        Map<String , String> valueMap = new HashMap<>();
        for(String input : inputs) {
            String[] value = input.split(" ");
            if(valueMap.containsKey(value[0])) {
                if(value[1].equals(valueMap.get(value[0]))) {
                    //NOP
                } else {
                    System.out.println("-1");
                    return;
                }
            }
            valueMap.put(value[0], value[1]);
        }
        StringBuffer ret = new StringBuffer();
        for(int i=1; i<=3; i++) {
            if(valueMap.containsKey(String.valueOf(i))) {
                ret.append(valueMap.get(String.valueOf(i)));
            } else {
                ret.append("0");
            }
        }
        if(ret.toString().startsWith("0")) {
            System.out.println("-1");
            return;
        }
        System.out.println(ret);
    }
}
