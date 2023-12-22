import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice dice1 = new Dice();
    	Dice dice2 = new Dice();
    	int count = 0;
    	
    	for(int i = 0; i < 6; i++){
    		dice1.S[i] = scan.nextInt();
    	}
    	for(int i = 0; i < 6; i++){
    		dice2.S[i] = scan.nextInt();
    	}
    	
    	for(int i = 0; i < 6; i++){
    		if(dice1.S[i] == dice2.S[i]) count++;
    	}
    	
    	count /= 2;
    	if(count == 1 || count == 3){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
     }
}

class Dice{
	int[] S = new int[6];
}