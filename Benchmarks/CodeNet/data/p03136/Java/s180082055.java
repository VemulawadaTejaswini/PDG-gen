import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.next());
    	ArrayList<Integer> lArrayList = new ArrayList<>();
    	for (int i=0; i<N; i++){
    		lArrayList.add(Integer.parseInt(sc.next()));
    	}

    	int max = lArrayList
    		      .stream()
    		      .mapToInt(v -> v)
    		      .max().orElseThrow(NoSuchElementException::new);

    	int sum = lArrayList
  		      .stream()
  		      .mapToInt(v -> v)
  		      .sum();

    	if ((sum-max) > max){
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
	}
}
