import java.util.Scanner; 
class Main{
    static public void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int S = sc.nextInt();
	while(0>S || S>=86400) System.out.println("imput agian.");
	int h = 0;
	int m = 0;
	int m2 = 0;
	int s = 0;
	if(S/60>0){ m = S/60; s = S%60;}
	if(m/60>0){ h = m/60; m = m%60;}
	System.out.println(h+":"+m+":"+s);
    }
}
