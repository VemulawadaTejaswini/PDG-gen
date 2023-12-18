import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 55555;
		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(2);
		prime.add(3);

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
                prime.add(i);
            }
        }

        int ans[] = new int[N];

        for(int n=0;n<5;n++){
        	ans[n] = prime.get(n);
        }

        int p = 5;
        for(int t=5;t<N;t++){
        	int sums = ans[t-4]+ans[t-3]+ans[t-2]+ans[t-1];
        	if(prime.indexOf(sums + prime.get(p)) != -1){
        		p++;
        	}
        	ans[t] = prime.get(p);
        	p++;
        }

        for(int a : ans){
        	System.out.print(a +" ");
        }
        System.out.println();
	}
}