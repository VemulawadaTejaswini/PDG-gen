
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
		public static void main(String[] args) {
			int n,m,a,b,count=0,i;
			Set<Integer> s=new TreeSet<Integer>();
			Scanner sc =new Scanner(System.in);
			n=sc.nextInt();
			m=sc.nextInt();
			while(true){
				if(n==0 && m==0)
					break;
				for(i=0;i<m;i++){
					a=sc.nextInt();
					b=sc.nextInt();
					if(a==1){
						//System.out.println("me");
						count++;
						s.add(b);
						//System.out.println(s);
					}
					else if(s.contains(a) && !s.contains(b)){
						//System.out.println(s.contains(a));
						count++;
					}
				}//for
				System.out.println(count);
				n=sc.nextInt();
				m=sc.nextInt();
				s.clear();
				count=0;
			}//while
		}
	}