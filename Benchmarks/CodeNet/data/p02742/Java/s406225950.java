import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	long H = sc.nextInt();
        long W = sc.nextInt();
      
      	long base1 = W / 2 + W % 2;
      	long base2 = (W -1)/2 + (W - 1) % 2;
      
      	long sum = (H / 2) *(base1 + base2) + (H % 2)*base1;	
      
        System.out.println(sum);
    }
}