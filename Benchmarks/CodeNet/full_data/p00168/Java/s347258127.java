import java.util.Scanner;




public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	while(true){
	    int year=0;
	    int n = in.nextInt();
	    if(n==0)break;
	    int num = step(n-1);
	    System.out.println((num / 3650) + (num % 3650 > 0 ? 1 : 0));
	}
	
	
	//	System.out.println(step(Integer.parseInt(args[0])));

    }

    public static int step(int n){
	if(n==0)return 1;
	if(n==1)return 2;
	if(n==2)return 4;
	int [] memo=new int[n];
	memo[0]=1;
	memo[1]=2;
	memo[2]=4;
	for(int i=3;i<n;i++){
	    memo[i]=memo[i-1]+memo[i-2]+memo[i-3];
	}
	return memo[n-1]+memo[n-2]+memo[n-3];
    }

}

