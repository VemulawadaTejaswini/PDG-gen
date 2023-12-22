import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] prime = new int[999999];
        prime[0] = 2;
        int num = 1;
        while(s.hasNext()) {
            int n = s.nextInt();
	    if (n==0)
		break;
            if (num < n) {
                for (int i=prime[num-1]+1 ; num<n ; i++) {
                    boolean flag = true;
                    for (int j=0 ; prime[j]*prime[j] <= i ; j++) {
                        if(i % prime[j] == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        prime[num] = i;
                        num++;
                    }
                }
	    }
	    int out = 0;
	    for(int i=0 ; i<num ; i++)
		out += prime[i];
	    System.out.println(out);
        }
    }
}