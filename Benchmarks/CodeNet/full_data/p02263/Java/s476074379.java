import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
	int [] St = new int[100];
	int index = 0;

	while(scan.hasNext()){
		String data = scan.next();
		if(data == "+"){
			index--;
			St[index-1] += St[index];
		}else if(data == "*"){
			index--; 
			St[index-1] *= St[index];
		}else if(data == "-"){
			index--;
			St[index-1] -= St[index];
		}else{
			St[index++] = Integer.parseInt(data);
		}
	}
		System.out.println(St[--index]);
  }
}