import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Long, Long> map = new TreeMap<Long,Long>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++) {
        	map.put(sc.nextLong(), sc.nextLong());
        }
        int hon=0;
    	long value=0;
        for (long key : map.keySet()) {
        	if(hon>=m)break;
			for(int i=0;i<map.get(key);i++) {
				hon++;
				value+=key;
				if(hon>=m)break;
			}
		}
        System.out.println(value);
    }
    }