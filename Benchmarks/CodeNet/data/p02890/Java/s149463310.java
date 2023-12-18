import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		int [] A = new int[N];
    		for (int i=0; i<N; i++) {
    			A[i] = sc.nextInt();
    		}
    		int [] temp = new int[30001];
    		for (int i=0; i<N; i++) {
    			temp[A[i]]++;
    		}

    		ArrayList<Integer> M = new ArrayList<>();
    		for (int i=0; i<temp.length; i++) {
    			if (temp[i] != 0) {
    				M.add(temp[i]);
    			}
    		}

    		Collections.sort(M, Comparator.reverseOrder());

    		for (int Ni=1; Ni<=N; Ni++) {
    			List<Integer> currentList = (ArrayList<Integer>) M.clone();

    			int canChoose = 0;
    			while (true) {
    				int chooseCount = Ni;
    				for (int j=0; j<currentList.size(); j++) {
    					if (currentList.get(j) > 0) {
    						chooseCount--;
        					currentList.set(j, currentList.get(j)-1);
        				}
    					if (chooseCount == 0) {
    						canChoose++;
    						break;
    					}
        			}

    				if (chooseCount != 0) {
    					break;
    				}

    				// Iterator<Integer> it = currentList.iterator();
    				// while (it.hasNext()) {
    				// if (it.next() == 0) {
    				// it.remove();
    				// }
    			    // }
    			}

    			System.out.println(canChoose);
    		}


    	} finally {
    		sc.close();
    	}
    }
}

