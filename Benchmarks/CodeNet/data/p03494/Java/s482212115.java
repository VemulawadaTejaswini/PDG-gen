import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int count = 0;
    boolean tf = true;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] numList = new int[num];
    for(int i = 0; i < num; i++){
    numList[i] =sc.nextInt();
    }
    
    while(tf == true){
    	for(int i = 0; i < num; i++){
    		if(numList[i] % 2 == 1) {
    	  	tf = false;
    	  	break;
            }else{
              numList[i] = numList[i] / 2;
   			}
    	}
      if(tf == true)count++;
    }
    System.out.println(count);   
  }
}