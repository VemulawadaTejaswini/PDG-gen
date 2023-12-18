import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 55555;
		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(2);

		boolean isPrime = false;
		for (int i = 5; i <= num; i += 2) {

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
            	if(i%5 == 1)
                prime.add(i);
            }
        }

        int ans[] = new int[N];

        for(int n=0;n<N;n++){
        	ans[n] = prime.get(n);
        }


        for(int a : ans){
        	System.out.print(a +" ");
        }
        System.out.println();
	}
}