import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n, s, max=0, min=1000, sum=0;
	while(true){
	    n = sc.nextInt();
	    if(n == 0) break;
	    for(int i=0;i<n;i++){
		s = sc.nextInt();
		sum+=s;
		if(s>max) max = s;
		if(s<min) min = s;
	    }
	    sum = sum-max-min;
	    System.out.println(sum/n);
	}
    }
}