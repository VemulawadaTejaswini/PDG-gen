import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Long> employeeResults = new TreeMap<Integer, Long>();

        while (sc.hasNext()) {
            int dataSetNum = sc.nextInt();

            if (dataSetNum == 0) break;

            for (int i = 0; i < dataSetNum; i++) {
                int employeeId = sc.nextInt();
                long sales = sc.nextInt() * sc.nextInt();

                if (employeeResults.containsKey(employeeId)) {
                    long org = employeeResults.remove(employeeId);
                    employeeResults.put(employeeId, org + sales);
                } else {
                    employeeResults.put(employeeId, sales);
                }
            }

            boolean isNA = true;
            for (Map.Entry<Integer, Long> employeeResult : employeeResults.entrySet()) {
                if (employeeResult.getValue() >= 1000000) {
                    System.out.println(employeeResult.getKey());
                    isNA = false;
                }
            }

            if (isNA) System.out.println("NA");
            employeeResults = new TreeMap<Integer, Long>();
        }

    }

}