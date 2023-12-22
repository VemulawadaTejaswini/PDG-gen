import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	long X = sc.nextInt();
    	if(X == 0){
    		System.out.println("0 0");
    		return;
    	}
    	List<Integer> divList = getDiv((int)X);
    	for(long i = 0; i < 200; i++) {
    		long i5 = i * i * i * i * i;
    		for(int div : divList) {
    			if(i > 70 && i < div){
    				break;
    			}
    			long j = i - div;
    			long j5 = j * j * j * j * j;
    			if(i5 - j5 == X) {
    				System.out.println(i + " " + j);
    				return;
    			}
    		}
    	}
    }
	
	private static List<Integer> getDiv(int X){
		List<Integer> divList = new ArrayList<>();
		for(int i = 1; i < 200; i++) {
			if(X % i == 0) {
				divList.add(i);
			}
		}
		return divList;
	}
}