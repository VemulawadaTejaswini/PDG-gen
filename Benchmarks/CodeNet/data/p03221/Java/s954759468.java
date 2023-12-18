import java.util.*;

public class Main {

    public static void main(String[] args) {
         //System.setIn(new FileInputStream("D:/samleInput.txt"));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> inputMap = new TreeMap<Integer, Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        Map<Integer,String> resultCodeMap = new HashMap<Integer, String>();

        for (int i=0;i<m;i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            inputMap.put(y, p);
            linkedHashSet.add(y);
        }
        Set<Integer> keySet = inputMap.keySet();
        Iterator<Integer> iter = keySet.iterator();
        int []zoneCitynum = new int[n+1];
        while (iter.hasNext()) {
            int yearKey = iter.next();
            int zone = inputMap.get(yearKey);

            for (int i = 1;i<=n;i++){
                if(zone == i){
                    zoneCitynum[i] ++;
                }
            }
            String resultCode = formatCode(String.valueOf(zone))+ formatCode(String.valueOf(zoneCitynum[zone]));
            resultCodeMap.put(yearKey,resultCode);
        }

        Iterator<Integer> iter1 = linkedHashSet.iterator();
        while (iter1.hasNext()){
            int year = iter1.next();
            String resultCode = resultCodeMap.get(year);
            System.out.println(resultCode);
        }
    }

    private static String formatCode(String intCode){

        char codeCharAray[] = intCode.toCharArray();
        while (codeCharAray.length<6){
            intCode= "0"+intCode;
           codeCharAray = intCode.toCharArray();
        }
        return intCode;
    }
}