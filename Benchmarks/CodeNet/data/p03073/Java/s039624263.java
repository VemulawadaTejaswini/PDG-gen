import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

    	int a = String.valueOf(N).length();
    	int ans;
    	int ans1=0;
    	int ans2=0;
    	int mem=0;
    	for(int i=0;i<a;i++){
			int b = N/(int)Math.pow(10, i)%10;
    	    if(b!=mem){
    	        ans1++;
    	    }
    	    if(mem==0){
    	        mem=1;
    	    }else{
    	        mem=0;
    	    }
   	     if(b!=mem){
    	        ans2++;
    	    }
	}

    if(ans1>=ans2){ans=ans2;}else{ans=ans1;}

		System.out.println(ans);
	}
}