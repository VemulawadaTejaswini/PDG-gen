import java.util.*;

public void main(String[] args){
	Scanner sc = new Scanner();
  	int a = sc.nextInt();
  	int b = sc.nextInt();
  	if(a*b % 2 == 0){
      	System.out.println("even");
    }
    else if(a*b % 2 == 1){
		System.out.println("0dd");
    }
}