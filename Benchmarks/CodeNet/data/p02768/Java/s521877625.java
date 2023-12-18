import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	sc.close();
    	long ans = 0;
    	int x = calcNumOfCombination(n, a) + calcNumOfCombination(n, b);
    	ans = func(n, 1, 0, 0, 0) - x;
    	if(ans != 0){
    		ans = ans % (1000000000+7);
    	}
    	System.out.println(ans);
    }

	static int func(int n, int r, int a, int b, int s){
		if(r == n) return 1;
		s = a * (n-(r-1)) / r * b;
		a = a * (n-(r-1));
		b = r * b;
		return func(n, r+1, a, b, s);
	}
    static int calcNumOfCombination(int n, int r){
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}