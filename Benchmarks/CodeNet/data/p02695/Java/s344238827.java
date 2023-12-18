import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int max = 0;
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
        	Integer[] array = new Integer[4];
        	array[0] = sc.nextInt();
        	array[1] = sc.nextInt();
        	array[2] = sc.nextInt();
        	array[3] = sc.nextInt();
        	list.add(array);
        }
        int[] ar = new int[M];
        for (int i = 0; i < M; i++) {
        	ar[i] = i + 1;
        }
        List<String> p = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, M); i++) {
        	String s = "";
        	for (int j = 0; j < M; j++) {
        		if ((1&(i>>j)) == 1) {
        			if (ar[j] == 10) {
        				s += "T";
        			} else {
        				s += ar[j];
        			}
        		}
        	}
        	p.add(s);
        }
        List<String> target =
        		p.stream().filter(i -> i.length() == N).collect(Collectors.toList());
        Collections.sort(target);
        for (String s : target) {
        	s.replace("10", "T");
        	char[] sar = s.toCharArray();
        	int now = 0;
        	for (Integer[] q : list) {
        		if (sar[q[1] - 1] == 'T') {
        			if (10 - (sar[q[0] - 1] - '0') == q[2]) {
        				now += q[3];
            		}
        		} else if (sar[q[0] - 1] == 'T') {
        			if ((sar[q[1] - 1] - '0') - 10 == q[2]) {
        				now += q[3];
            		}
        		}
        		else if (sar[q[1] - 1] - sar[q[0] - 1] == q[2]) {
        			now += q[3];
        		}
        		if (max < now) {
        			max = now;
        		}
        	}
        }
        System.out.println(max);
    }
}