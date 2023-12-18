
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
	    //String input1 = scanner.next();
	    String input2 = scanner.next();
	    int max=0;
	    //int h=Integer.parseInt(input1);
	    int n=Integer.parseInt(input2);
	    String a[]=new String[n];
	    int b[]=new int[n];
	    Set<String> sa=new HashSet<String>();
	    for(int i=0;i<n;i++) {
	    	a[i]=scanner.next();
	    	for(int j=0;j<i;j++) {
	    		if(a[i].equals(a[j])) {
	    			b[j]++;
	    			if(b[j]>max) {
	    				max=b[i];
	    			}
	    			break;
	    		}

	    	}
	    }

	    for(int i=0;i<n;i++) {
	    	if(b[i]>max) {
	    		max=b[i];
	    	}
	    }
	    List c=new ArrayList();
	    for(int i=0;i<n;i++) {
	    	if(b[i]==max) {
	    		c.add(a[i]);
	    	}
	    }
	    scanner.close();
	    c.stream()
	    .sorted()
	    .forEach(d->System.out.println(d));
	    /*int sum=sa.stream()
	    		.mapToInt(s->Integer.parseInt(s))
	    		.sum();
	    	System.out.println("YES");*/
	}

}
