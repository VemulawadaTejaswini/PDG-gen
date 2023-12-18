import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        StringBuilder q = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	x[i] = scan.nextInt();
        	y[i] = scan.nextInt();
        	q.append(i);
        }

        double sum = 0.0;
        permutation(q.toString(), "");

        for(int i = 0; i < list.size(); i++) {
        	String temp = list.get(i);
        	int tempX = x[Character.getNumericValue(temp.charAt(0))];
        	int tempY = y[Character.getNumericValue(temp.charAt(0))];
        	for(int j = 1; j < temp.length(); j++) {
        		sum += Math.pow(Math.pow(tempX - x[Character.getNumericValue(temp.charAt(j))], 2)
        				+ Math.pow(tempY - y[Character.getNumericValue(temp.charAt(j))], 2), 0.5);

        		tempX = x[Character.getNumericValue(temp.charAt(j))];
        		tempY = y[Character.getNumericValue(temp.charAt(j))];
        	}
        }
        System.out.println(sum / list.size());

    }
    public static void permutation(String q, String ans){
        if(q.length() <= 1) {
            list.add(ans + q);
        }
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }

}