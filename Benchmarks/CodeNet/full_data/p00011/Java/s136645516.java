import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        	int verticalLineNum = Integer.parseInt(br.readLine());
        	int horizontalLineNum = Integer.parseInt(br.readLine());

        	List<Integer> numberList = new ArrayList<>();

        	for(int i = 1; i <= verticalLineNum; i++) {
        		numberList.add(i);
        	}

        	for(int j = 0; j < horizontalLineNum; j++) {
        		String line = br.readLine();
                String[] dataSet = line.split(",");

                numberList = swap(numberList, Integer.parseInt(dataSet[0]), Integer.parseInt(dataSet[1]));
        	}


        	for(int k = 0; k < verticalLineNum; k++) {
        		System.out.println(numberList.get(k));
        	}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static List<Integer> swap(List<Integer> numberList, int a, int b) {
		int temp = numberList.get(a-1);
		numberList.set(a-1, numberList.get(b-1));
		numberList.set(b-1, temp);
        return numberList;
	}

}