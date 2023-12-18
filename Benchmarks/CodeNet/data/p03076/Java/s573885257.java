import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	int sum = 0;
	int min = 0;
	int minI = 0;
	for(int i = 0; i<5; i++) {
	    int num = sc.nextInt();
	    a[i] = num;
	    if(num%10!=0) {
		if(min == 0) {
		    min = num % 10;
		    minI = i;
		}
		else if(min> (num%10)) {
		    min = (num%10);
		    minI = i;
		}
	    }
        }
	for(int i = 0; i<5; i++) {
	    if(a[i]%10==0) {
		sum += a[i];
	    }else if(i == minI) {
		sum += a[i];
	    }else {
		int num = a[i];
		num = num/10;
		sum += (num+1)*10;

	    }
	}


	System.out.println(sum);
    }
}