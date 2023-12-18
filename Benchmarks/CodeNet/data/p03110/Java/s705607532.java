import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	double[] ary = new double[N];
    	String[] strAry = new String[N];
    	double ans = 0;
    	for(int i = 0; i < N; i++){
    		ary[i] = Double.parseDouble(sc.next());
    		strAry[i] = sc.next();
    		if(strAry[i].equals("BTC")) ary[i] = ary[i] * 380000;
    		ans += ary[i];
    	}
    	sc.close();
    	System.out.println(ans);
    }
}