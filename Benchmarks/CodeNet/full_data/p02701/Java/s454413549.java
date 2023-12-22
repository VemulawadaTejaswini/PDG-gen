import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// くじ引き回数
		int N = sc.nextInt();
        List<String> listA = new ArrayList<String>(N);
		for (int i=0; i<N; i++) {
          listA.add(sc.next());
        }

        List<String> listB = new ArrayList<String>(new HashSet<>(listA));

        //System.out.println("ListA = " + listA);
        //System.out.println("ListB = " + listB);
        System.out.println(listB.size());
	}
}