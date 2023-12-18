import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();

List<Integer> c = new ArrayList<Integer>();
int count = 0;

for(int i = 0; i<N; i++) {
	c.add(sc.nextInt());

}
while (containEven(c)) {
	int even = 0;
	for(int i = 0; i< c.size(); i++) {
	      int x = c.get(i);
		if(x  % 2 == 0 && even < 1) {
			c.set(i,x /2);
			even++;
		} else {
			c.set(i,x * 3);
		}
	}
	
	count++;

}
System.out.println(count);

}

public static boolean containEven(List<Integer> c) {
	for(int x : c) {
		if(x  % 2 == 0) {
			return true;
		} 
}
return false;
}
}