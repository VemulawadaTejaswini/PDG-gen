import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
List<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
for(int i =0; i < a; i++) {
  list.add(sc.nextInt());
}

List<Integer> deduped = list.stream().distinct().collect(Collectors.toList()); 
int size = deduped.size();
if((size % 2) == 0) {
System.out.println(size/2);
} else {
System.out.println((size-1)/2);
}
	}
}