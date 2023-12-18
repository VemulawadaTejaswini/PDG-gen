import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int count = 0;
    boolean tf = true;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int numList[] = new int[num];
    for(int i = 0; i < num; i++){
    numList[i] =sc.nextInt();
    }
    int numList[] = new int[num];
    
    while(tf == true){
    	for(int i = 0; i < num; i++){
    		if(numList[i] / 2 == 1) {
    	  	tf = false;
    	  	break;
   			}
    	}
      count++;
    }
    System.out.println(count);   
  }
}