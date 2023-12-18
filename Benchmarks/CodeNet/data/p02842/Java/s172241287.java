import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double nn = n/1.08;
      	int x = (int)nn;
      	int check = 0;
      	double check0 = x*1.08;
      	int check1 = (int)check0;
      	double check2 = (x+1)*1.08;
      	int check3 = (int)check2;
      	if(check1==n){
          System.out.println(x);
        }else if(check3==n){
          System.out.println(x+1);
        }else{
          System.out.println(":(");
        }
	}
}
