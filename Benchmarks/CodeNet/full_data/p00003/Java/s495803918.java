import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){

	    int[] num = new int[3];
	    int max = 0;
	    for(int i=0; i<3; i++){
		num[i] = sc.nextInt();
		if(num[i]>max){max = num[i];}
	    }

	    int sum = 0;
	    for(int i=0; i<n; i++){
		if(num[i]!=max){
		    sum += num[i]*num[i];
		}
	    }
	    String ans = "NO";
	    if(max*max==sum){ans = "YES";}

	    System.out.println(ans);
	    n--;
	}
    }
}