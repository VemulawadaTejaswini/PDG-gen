import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();


    	ArrayList<Integer> result = new ArrayList<>();

    	for(int i=0;i<N;i++) {
    		result.add(sc.nextInt());
    	}
		ArrayList<Integer> ans = new ArrayList<Integer>(new HashSet<>(result));

		if(result.size()==ans.size()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

    }

}