import java.util.*;
public class Main {
	static long ways=0;
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int k=sc.nextInt();
         int n=sc.nextInt();
         Set<Integer> set = new HashSet<>();
         for(int i=0;i<n;i++) {
        	 int x=sc.nextInt();
        	 int y=sc.nextInt();
        	 set.add(x);
        	 set.add(y);
         }
         ArrayList<Integer> list = new ArrayList<>(set);
         Collections.sort(list);
         int i=1;
         func(list,i,k);
         System.out.println(ways%998244353);
         
	}
	public static void func(ArrayList<Integer> list,int p,int n) {
		if(p==n) {
			ways++;
			return;
		}
		if(p>n)return;
		for(int i=0;i<list.size();i++) {
			if(p+list.get(i)<=n)
			func(list,p+list.get(i),n);
		}
		
	}

}