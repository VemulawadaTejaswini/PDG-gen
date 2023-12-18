import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for(int time =0; time<k; ){
        	if(a%2 == 1){
        		a -= 1;
        		a /= 2;
        		b += a;
        		k += 1;
        	}else{
        		a /= 2;
        		b += a;
        		k += 1;
        	}

        	if(time<k){
        		if(b%2 == 1){
        			b-= 1;
        		}
        		b /= 2;
        		a += b;
        		k += 1;
        	}
        }
        System.out.println(a + " " + b);

    }
}