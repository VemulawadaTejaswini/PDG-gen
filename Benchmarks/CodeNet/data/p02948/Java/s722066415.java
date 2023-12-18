import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Work> lead = new PriorityQueue<Work>(new Comparator<Work>() {
		    public int compare(Work w1, Work w2) {
		        return w2.days - w1.days;
		    }
		});
		for (int i = 0; i < n; i++) {
		    Work w = new Work(sc.nextInt(), sc.nextInt());
		    if (w.days <= m) {
		        lead.add(w);
		    }
		}
		PriorityQueue<Work> stock = new PriorityQueue<Work>(new Comparator<Work>() {
		    public int compare(Work w1, Work w2) {
		        return w1.value - w2.value;
		    }
		});
		while (lead.size() > 0) {
		    Work w = lead.poll();
		    stock.add(w);
		    if (stock.size() > m - w.days + 1) {
		        stock.poll();
		    }
		}
		long sum = 0;
		while (stock.size() > 0) {
		    sum += stock.poll().value;
		}
		System.out.println(sum);
   }
   
   static class Work {
       int days;
       int value;
       
       public Work (int days, int value) {
           this.days = days;
           this.value = value;
       }
       
       public String toString() {
           return "days:" + days + " value:" + value;
       }
   }
}


