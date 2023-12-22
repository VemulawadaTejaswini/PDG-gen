import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int nx = stdIn.nextInt();
        int [] x = new int[nx];

        for(int i = 0; i < nx; i++){
        	x[i] = stdIn.nextInt();
        }
        stdIn.close();

        int count=0;
		for (int i = 0; i < nx - 1; i++) {
			int keyIndex = i;
            for (int j = i + 1; j < nx ; j++) {
                    if(x[keyIndex] > x[j]){
                    	keyIndex = j;
                    }
            }
            if(keyIndex == i) {
            	continue;
            }
            int tmp = x[i];
            x[i] = x[keyIndex];
            x[keyIndex] = tmp;
            count++;
        }
        out_put(x);
        System.out.println(count);
	}
	private static void out_put(int array[]){

        System.out.printf("%d", array[0]);

        if (array.length >1) {
        	for(int i = 1; i < array.length; i++){
        		System.out.printf(" %d", array[i]);
        	}
        }
        System.out.printf("%n");
    }
}

