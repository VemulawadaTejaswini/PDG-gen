import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = n/1.08;
      	int check = 0;
      	if(x*1.08==n){
          check=1;
          System.out.println(x);
          break;
        }else if((x-1)*1.08==n){
          check=1;
          System.out.println(x-1);
          break;
        }if((x+1)*1.08==n){
          check=1;
          System.out.println(x+1);
          break;
        }else{
          System.out.println(":(");
        }
	}
}