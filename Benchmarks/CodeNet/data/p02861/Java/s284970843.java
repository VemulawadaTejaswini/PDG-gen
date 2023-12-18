import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] X = new double[N];
        double[] Y = new double[N];
        for (int i=0; i<N; i++){
            X[i] = (double)sc.nextInt();
            Y[i] = (double)sc.nextInt();
        }
        double sum = 0;
        double count = 0;
        for (int i=0; i<N; i++){
            for (int j=i+1; j<N; j++){
                sum += Math.sqrt((X[i]-X[j])*(X[i]-X[j]) + (Y[i]-Y[j])*(Y[i]-Y[j]));
                count += 1;
            }
        }
        System.out.println(sum/count*(N-1));
	}
}