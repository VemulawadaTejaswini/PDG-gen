import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long a = Long.parseLong(scan.next());
        long b = Long.parseLong(scan.next());
        long c = Long.parseLong(scan.next());
        long n = Long.parseLong(scan.next());
        
        List<Long> aList = new ArrayList<Long>();
        for (int i=0; i < a; i++) {
            aList.add(Long.parseLong(scan.next()));
        }
        List<Long> bList = new ArrayList<Long>();
        for (int i=0; i < b; i++) {
            bList.add(Long.parseLong(scan.next()));
        }
        List<Long> cList = new ArrayList<Long>();
        for (int i=0; i < c; i++) {
            cList.add(Long.parseLong(scan.next()));
        }
        
        Collections.sort(aList, Collections.reverseOrder());
        Collections.sort(bList, Collections.reverseOrder());
        Collections.sort(cList, Collections.reverseOrder());
        
        List<Long> ansList = new ArrayList<Long>();
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