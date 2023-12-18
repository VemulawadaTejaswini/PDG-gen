public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	double N = sc.nextInt();
    	double K = sc.nextInt();

    	double a = N%K;

    	double b = K - a;

    	if(a<=b){
    	   	System.out.println(a);
    	} else {
    		System.out.println(b);
    	}



    }
}