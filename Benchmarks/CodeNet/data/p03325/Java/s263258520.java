import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();

		List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
        	inputList.add(sc.nextInt());
        }

        int ansNum = 0;
        while(1==1) {
	        int maxEvn = 0;
	    	int maxEvnIndex= 0;
	    	int evnFlg = 0;
	        for(int i=0; i<inputList.size(); i++) {
	        	if (inputList.get(i) % 2 == 0) {
	        		if (inputList.get(i) > maxEvn) {
	        			maxEvn = inputList.get(i);
	        			maxEvnIndex = i;
	        			evnFlg = 1;
	        		}
	        	}
	        }

	        if (evnFlg == 0) {
	        	System.out.println(ansNum);
	        	return;
	        } else {
	        	ansNum++;
	        }

	        for(int i=0; i<inputList.size(); i++) {
	        	if(i == maxEvnIndex) {
	        		inputList.set(i, inputList.get(i)/2);
	        	} else {
	        		inputList.set(i, inputList.get(i)*3);
	        	}
	        }
        }


	}

}

