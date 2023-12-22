import java.util.Scanner;

public class Main  {
    static int sum(int[] arr){
	int res = 0;
	for(int i=0; i<arr.length;++i){
	    res += arr[i];
	}
	return res;
    }
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int n = sc.nextInt();
	    if(n == 0){
		sc.close();
		return;
	    }
	    int[] s = new int[n];
	    for(int i=0; i<n;++i){
		s[i] = sc.nextInt();
	    }
	    
	    double ave = sum(s)/n;
	    double sumofdiff = 0;

	    for(int i=0; i<n;++i){
		sumofdiff += (s[i] - ave) * (s[i] - ave);
	    }
	    sumofdiff /= n;
	
	    double res = Math.sqrt(sumofdiff);
	    System.out.printf("%.8f\n", res);
	}
    }
}