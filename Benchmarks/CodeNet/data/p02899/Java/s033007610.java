import java.util.*;
public class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	ArrayList<Integer> intList = new ArrayList<Integer>();
      	for(int i = 0; i<N;i++){
        	intList.add(sc.nextInt());
        }
      	int resultInt = 0;
      	String resultStr = "";
        for(int j = 1;j<=N;j++){
        	resultInt = intList.indexOf(j)+1;
          	resultStr += String.valueOf(resultInt)+" ";
        }
      	System.out.print(resultStr);
    }
}