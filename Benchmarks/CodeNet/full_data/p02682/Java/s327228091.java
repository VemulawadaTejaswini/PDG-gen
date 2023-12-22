import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int num1 = Integer.parseInt(sc.next());
	int num0 = Integer.parseInt(sc.next());
    int numMinus1 = Integer.parseInt(sc.next());
    int numToSelect = Integer.parseInt(sc.next());

    int sum = 0;
	if(numToSelect <= num1){
    	sum = numToSelect * 1;
    }else if(num1 < numToSelect && numToSelect <= (num1+num0)){
        sum = num1 * 1;
    }else if((num1+num0) < numToSelect && numToSelect <= (num1+num0+numMinus1)){
        sum = num1 * 1 + (numToSelect-(num1+num0)) * -1;
    }else if((num1+num0+numMinus1) < numToSelect){
      	sum = num1 * 1 + numMinus1 * -1;
    }

    System.out.println(sum);
  }
}