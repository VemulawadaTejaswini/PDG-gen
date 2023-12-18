import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double nn = n/1.08;
      	int x = (int)nn;
      	int check = 0;
      	int check1 = x*1.08;
      	int check2 = (x+1)*1.08;
      	if(check1==n){
          System.out.println(x);
        }else if(check2==n){
          System.out.println(x+1);
        }else{
          System.out.println(":(");
        }
	}
}
