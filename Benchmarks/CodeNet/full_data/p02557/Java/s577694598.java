import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static class Pair {
    	int a, b;

		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
    }
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.nextInt();
        HashMap<Integer, Integer> A = new HashMap<>();
        HashMap<Integer, Integer> B = new HashMap<>();
        for(int i=0; i<N; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();

        	Integer aCount = A.get(a);
        	if(aCount == null)
        		aCount = 0;
        	A.put(a, aCount+1);

        	Integer bCount = B.get(b);
        	if(bCount == null)
        		bCount = 0;
        	B.put(b, bCount+1);

        }
        
        
        LinkedList<Pair> aUsed = new LinkedList<>();
        LinkedList<Pair> bUsed = new LinkedList<>();
        LinkedList<Pair> abUsed = new LinkedList<>();
        int notUsed = N;
        for(int i=1; i<=N; i++) {
        	Integer aCount = A.get(i);
        	if(aCount==null)
        		aCount = 0;
        	for(int j=0; j<aCount; j++) {
        		if(notUsed>0) {
        			aUsed.add(new Pair(i, -1));
        			notUsed--;
        		} else {
        			Pair p = bUsed.poll();
        			if(p.b==i) {
        				System.out.println("No");
        				sc.close();
        				pw.close();
        				return;
        			}
        			p.a = i;
        			abUsed.add(p);
        		}
        	}
        	
        	Integer bCount = B.get(i);
        	if(bCount==null)
        		bCount = 0;
        	for(int j=0; j<bCount; j++) {
        		if(notUsed>0) {
        			bUsed.add(new Pair(-1, i));
        			notUsed--;
        		} else {
        			Pair p = aUsed.poll();
        			if(p.a==i) {
        				System.out.println("No");
        				sc.close();
        				pw.close();
        				return;
        			}
        			p.b = i;
        			abUsed.add(p);
        		}
        	}
         	
        }
        ArrayList<Pair> sorted = new ArrayList<>();
        sorted.addAll(abUsed);
        sorted.sort(new Comparator<Pair>() {
        	public int compare(Pair p1, Pair p2) {
        		return Integer.compare(p1.a, p2.a);
        	}
        });
        
        pw.println("Yes");
        for(int i=0; i<N; i++)
        	pw.print(sorted.get(i).b + (i==N-1 ? "\n" : " "));
        
        System.out.println();
        sc.close();
        pw.close();
	}
}
