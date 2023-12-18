import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] ingredients = new double[n];
		for(int i=0;i<n;i++){
			ingredients[i] = sc.nextDouble();
		}
		Arrays.sort(ingredients);
		double answer = (ingredients[0]+ingredients[1])/2;
		for(int i=2;i<n;i++){
			answer = (answer+ingredients[i])/2;
        }
        System.out.println(answer);
	}
}