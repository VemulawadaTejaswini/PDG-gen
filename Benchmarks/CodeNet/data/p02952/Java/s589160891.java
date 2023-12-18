import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	double N = sc.nextDouble();

	int power = 0;

	while(N>=10){

	power++;
	
	N /= 10;

 }	

	int ans = 0;

	if(power%2 == 1){

	for(int i=1; i<=power; i++){

	if(i%2 == 1){

	ans += 9*Math.pow(10,i-1);

   }
  }

}

	if(power%2 == 1){

	System.out.println(ans);

}

	else{

	System.out.println(ans+(N+1-1*Math.pow(10,power)));

}	


 }
}