import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        List<Long> ansList = new ArrayList<Long>();
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long n = scan.nextLong();
        
        List<Long> aList = new ArrayList<Long>();
        for (int i=0; i < a; i++) {
            aList.add(scan.nextLong());
        }
        List<Long> bList = new ArrayList<Long>();
        for (int i=0; i < b; i++) {
            bList.add(scan.nextLong());
        }
        List<Long> cList = new ArrayList<Long>();
        for (int i=0; i < c; i++) {
            cList.add(scan.nextLong());
        }
        
        Collections.sort(aList, Collections.reverseOrder());
        Collections.sort(bList, Collections.reverseOrder());
        Collections.sort(cList, Collections.reverseOrder());
        
        List<Long> tmpList = new ArrayList<Long>();
        for(long aNum : aList) {
            for(long bNum : bList) {
                for(long cNum : cList) {
                    ansList.add(aNum + bNum + cNum);
                }
            }
        }

        Collections.sort(ansList, Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            System.out.println(ansList.get(i));
        }
    }
}