import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int num = input.nextInt();
    	input.nextLine();
    	boolean[][] cards = new boolean[4][13];
    	for(int i = 0 ; i < num ; i++){
    		String[] st = input.nextLine().split(" ");
    		if(st[0].equals("S")){
    			cards[0][Integer.parseInt(st[1])-1] = true;
    		}else if(st[0].equals("H")){
    			cards[1][Integer.parseInt(st[1])-1] = true;
    		}else if(st[0].equals("C")){
    			cards[2][Integer.parseInt(st[1])-1] = true;
    		}else if(st[0].equals("D")){
    			cards[3][Integer.parseInt(st[1])-1] = true;
    		}
    	}
    	
    	for(int i = 0 ; i < cards.length ; i++){
    		for(int j = 0 ; j < cards[i].length ; j++){
    			if(!cards[i][j]){
    				if(i == 0){
    					System.out.println("S "+(j+1));
    				}else if(i == 1){
    					System.out.println("H "+(j+1));
    				}else if(i == 2){
    					System.out.println("C "+(j+1));
    				}else if(i == 3){
    					System.out.println("D "+(j+1));
    				}
    			}
    		}
    	}
    }
}