
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int n,m,count=0,i;
		int a[]=new int[10000];
		int b[]=new int[10000];
		Set<Integer> s=new TreeSet<Integer>();
		Set<Integer> test=new TreeSet<Integer>();
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		
		while(true){
			if(n==0 && m==0)
				break;
			for(i=0;i<m;i++){
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();

				if(a[i]==1){
					count++;
					//System.out.println(a[i]+" "+b[i]);
					s.add(b[i]);
					test.add(b[i]);
				}
			}
			
			System.out.println(s);
			for(i=0;i<m;i++){
				if(s.contains(a[i]) && !test.contains(b[i]) && a[i]!=1 && b[i]!=1){
					count++;
					//System.out.println(a[i]+" "+b[i]);
					test.add(b[i]);
				}
				else if(!test.contains(a[i]) && s.contains(b[i]) && a[i]!=1 && b[i]!=1){
					//System.out.println(s.contains(a));
					count++;
					//System.out.println(a[i]+" "+b[i]);
					test.add(a[i]);
				}
			}

			System.out.println(count);
			System.out.println(test);
			n=sc.nextInt();
			m=sc.nextInt();
			s.clear();
			test.clear();
			count=0;
		}//while
	}
}