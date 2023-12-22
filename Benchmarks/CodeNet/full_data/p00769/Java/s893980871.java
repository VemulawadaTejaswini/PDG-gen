import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			for(int i=0; i<n; i++) {
				ArrayList<Integer> list=new ArrayList<>();
				Stack<String> stack=new Stack<String>();
				String str=sc.next();
				int len=str.length();
				int num=0;
				for(int j=0; j<len; j++) {
					if(str.charAt(j)=='[') {
						stack.push("]");
					}
					else if(str.charAt(j)==']') {
						if(num>0) {
							num/=10;
							num=num/2+1;
							stack.add(String.valueOf(num));
						}
						String k="";
						while((k=stack.pop())!="]") {
							int p=Integer.parseInt(k);
							list.add(p);
						}
						Collections.sort(list);
						int sum=0;
						for(int point=0; point<list.size()/2+1; point++) {
							sum+=list.get(point);
						}
						list.clear();
						stack.add(String.valueOf(sum));
						num=0;
					}
					else {
						num+=str.charAt(j)-'0';
						num*=10;
					}
					if(j==len-1) {
						System.out.println(stack.pop());
						break;
					}
				}
			}
			
			
		}
	}
}
