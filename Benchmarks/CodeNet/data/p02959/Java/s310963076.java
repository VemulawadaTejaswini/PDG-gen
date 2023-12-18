import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	     int N  = scan.nextInt();

	     List<Integer>monster = new ArrayList<Integer>();
	     	for(int i=0;i<N+1;i++) {
	     		monster.add(scan.nextInt());
	     	}
     	List<Integer>brave = new ArrayList<Integer>();
     	for(int i=0;i<N;i++) {
     		monster.add(scan.nextInt());
     	}


     	int count =0;

     	for(int i=0;i<N;i++) {
     		count += brave.get(i);
     		if(monster.get(i) >= brave.get(i)) {
     			//count += brave.get(i);
     			continue;
     		}
     		monster.set(i+1, monster.get(i+1)+ (brave.get(i) - monster.get(i)));
     	}
     	if(monster.get(N+1) < (brave.get(N) - monster.get(N))) {
     		count += monster.get(N+1);
     	}else {
     		count +=   (brave.get(N) - monster.get(N));
     	}
     	System.out.println(String.valueOf(count));
	}
}