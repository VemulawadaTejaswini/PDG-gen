import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    String s[]=new String[n];
	    for(int i=0;i<n;i++) {
	    	s[i]=scan.next();
	    }
	    int m = scan.nextInt();
	    String t[]=new String[m];
	    for(int i=0;i<m;i++) {
	    	t[i]=scan.next();
	    }
	    scan.close();
	    int sum,max=0;
	    for(int i=0;i<n;i++) {
	    	sum=0;
	    	for(int j=0;j<n;j++) {
	    		if(s[i].equals(s[j]))sum+=1;
	    	}
	    	 for(int j=0;j<m;j++) {
	    		 if(s[i].equals(t[j]))sum-=1;
	    	 }
	    	 if(max<sum)max=sum;
	    }
	    System.out.println(max);
	}

}