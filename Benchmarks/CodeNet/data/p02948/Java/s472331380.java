import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
        int []A = new int[n];
        int []B = new int[n];
        for(int i=0;i<n;i++) {
        	A[i]=sc.nextInt();
        	B[i]=sc.nextInt();
        }
        Data []d = new Data[n];
        for(int i= 0; i < n; i++) {
            d[i] = new Data(A[i], B[i]);
        }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getA() - d2.getA();
            }
        });
        
        int ans = 0;
        int j=0;
      
		Queue<Integer> q = new PriorityQueue(new MyComparator());
        
        for(int i=1;i<=m;i++) {
        	while(j<n&&d[j].getA()<=i) {
        		q.add(d[j].getB());
        		j++;
        	}
        	if(q.isEmpty()) continue;
        	ans+=q.poll();
        	
        }
        
        System.out.println(ans);
	}
	
}

	class Data{
		  private int a;
		    private int b;
		    public Data(int a, int b) {
		        this.a = a;
		        this.b = b;
		    }
		    public int getA() {
		        return a;
		    }
		    public int getB() {
		        return b;
		    }
}

	class MyComparator implements Comparator {
		 
	    public int compare(Object obj1, Object obj2) {
	         
	        int num1 = (int)obj1;
	        int num2 = (int)obj2;
	         
	        if(num1 < num2) {
	            return 1;
	        } else if(num1 > num2) {
	            return -1;
	        } else{
	            return 0;
	        }
	    }
	}


