import java.util.Scanner;

class Main {

    public static double[] calc(double[][] a, double[] b){
	for(int i = 0; i < a.length; i++){
	    double pivot = a[i][i];
	    for(int j = i; j < a[i].length; j++){
		a[i][j] /= pivot;
	    }
	    b[i] /= pivot;
	    for(int h = 0; h < a.length; h++){
		if(h == i) continue;
		pivot = a[h][i];
		for(int w = i; w < a[0].length; w++){
		    a[h][w] -= a[i][w] * pivot;
		}
		b[h] -= b[i] * pivot;
	    }
	}
	double[] ans = new double[b.length];
	for(int i = 0; i < ans.length; i++){
	    ans[i] = b[i];
	}
	return ans;
    }

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	double[] input = new double[8];
	while(stdin.hasNextDouble()){
	    for(int i = 0; i < input.length; i++){
		input[i] = stdin.nextDouble();
	    }
	    double[][] a = new double[2][2];
	    double[] b = new double[2];

	    a[0][0] = input[2] - input[0];
	    a[1][0] = input[3] - input[1];
	    a[0][1] = input[4] - input[0];
	    a[1][1] = input[5] - input[1];
	    b[0] = input[6] - input[0];
	    b[1] = input[7] - input[1];
	    double[] ans = calc(a, b);
	    if(ans[0] >= 0 && ans[1] >= 0 && ans[0] + ans[1] <= 1){
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
}