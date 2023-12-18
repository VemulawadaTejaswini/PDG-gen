import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){

       Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();
	long a,b,c,d;


        for(int i = 0;i < t;i++){
        String ans = "Yes";
            a = stdIn.nextLong();
            b = stdIn.nextLong();
            c = stdIn.nextLong();
            d = stdIn.nextLong();

	    if(a < b){
		ans = "No";
	    }
	    else if(b > d){
		ans = "No";
	    }
	    else if(b <= c){
	    }
	    else{
		long n = a % b;
                if(d %  b== 0){
		      if(n > c && n < b){
                            ans = "No";
                      } 
                }
                else{
                     if((c - n) % ( d % b) == 0)
			 n += (d % b) * ((c - n) / (d % b));
                     else
                     	n += (d % b) * ((c - n) / (d % b) + 1);
                     if(n < b){
		        ans = "No";
		     }
                }
            }
	    System.out.println(ans);
        }   
    }
}