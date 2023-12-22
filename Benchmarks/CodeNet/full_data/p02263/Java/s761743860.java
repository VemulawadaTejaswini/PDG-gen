import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	ArrayDeque<Integer> a = new ArrayDeque<Integer>();
  	Scanner sc = new Scanner(System.in);
  	
  	while(sc.hasNext()){
  		if(sc.hasNextInt()){
			a.push(sc.nextInt());
  		}else{
  			int o1 = a.pop();
  			int o2 = a.pop();
  			switch(sc.next().charAt(0)){
	  			case '+':
		  			a.push(o1 + o2);
		  			break;
		  		case '-':
		  			a.push(o2 - o1);
		  			break;
		  		case '*':
		  			a.push(o1 * o2);
		  			break;
		  		default:
		  			break;
  			}
  		}
  	}
  	System.out.println(a.pop());

  }
  
}