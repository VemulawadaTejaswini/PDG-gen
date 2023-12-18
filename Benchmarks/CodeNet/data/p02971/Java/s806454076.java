import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();

    	int d[] = new int[n];
    	int max = 0;
    	int subMax = 0;

    	for (int i = 0; i < n; i++){
    		d[i] = sc.nextInt();
    		if (i > 0){
    			if (max < d[i]){
            		max = d[i];
    			} else if (subMax < d[i]){
    				subMax = d[i];
    			}

    		} else {
    			max = d[i];
    			subMax = d[i];
    		}
    	}


    	for (int j = 0; j < n; j++){
    		if (d[j] == max){
    	    	// 出力
    	    	System.out.println(subMax);
    		} else {
    	    	// 出力
    	    	System.out.println(max);
    		}
    	}


    }
}