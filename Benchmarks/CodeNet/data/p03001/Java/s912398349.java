import java.util.*;
public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		// 整数の入力
		double W = sc.nextInt();
    double H = sc.nextInt();
    double x = sc.nextInt();
    double y = sc.nextInt();

    double[] ansf = new double[2];
		double[] anss = new double[2];

    ansf[0] = x * H;
    ansf[1] = (W-x) * H;

    anss[0] = W * y;
    anss[1] = W * (H-y);

    Arrays.sort(ansf);
		Arrays.sort(anss);

		if(ansf[0] == 0){
			ansf[0] = ansf[1];
		}

		if(anss[0] == 0){
			anss[0] = anss[1];
		}
		
		double answer = ansf[0];
		if(anss[0] > ansf[0]){
			answer = anss[0];
		}

    double ans1 = ansf[0];
    double ans2 = anss[0];


    int same = 0;
    if(ans1 == ans2){
    	same = 1;
    }



		System.out.println(answer + " " + same);
	}
}