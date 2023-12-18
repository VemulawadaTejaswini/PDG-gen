import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int k = 0;
		in.next();
		int num = in.nextInt();
		int[]  c = new int[num];
		for (int i=0;i<num;i++){
			c[i] = in.nextInt();
		}
		Arrays.sort(c);
		List<A> a = new ArrayList<>();
		for(int i=1;i<c.length;i++){
			if(c[i] == c[i-1]){
				if(i == c.length-1){
					A a1 = new A(c[i],i-k+1);
					a.add(a1);
				}
			}else{
				A a1 = new A(c[i-1],i-k);
				k = i;
				a.add(a1);
			}
		}
		a.sort(new Comparator<A>(){
			public int compare(A a1,A a2){
				return a1.compareTo(a2);
			}
		});
		int max = a.get(0).value;
		
		while(a.size() > 1){
			boolean f = true;
			for(int i=0;i<a.size();i++){
				if(a.get(i).value == max){
					
				}else{
					f = false;
					a.remove(i);
				}
			}
			if(f) break;
		}
		
		for (int i=1;i<=len;i++){
			boolean f = false;
			for(A a1:a){
				if(i == a1.index){
					f = true;
				}
			}
			if(f)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}	
		
		
		
class A implements Comparable<A>{
	public A(){}
	public A(int i,int v){
		index =i;
		value = v;
	}
	int index;
	int value;
	
	public int compareTo (A a){
		return value < a.value ? 1 : -1;
	}
}	
	