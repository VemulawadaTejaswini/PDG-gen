import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int moveCount = Integer.parseInt(sc.nextLine());
    	
    	boolean okFlag = true;
    	int prePosX = 0;
    	int prePosY = 0;
    	int preTime = 0;
    	//check the route avaible
    	for(int i = 1;i<=moveCount;i++) {
    		String[] line = sc.nextLine().split(" ");
    		int time = Integer.parseInt(line[0]);
    		int posX = Integer.parseInt(line[1]);
    		int posY = Integer.parseInt(line[2]);
    		int disX = Math.abs(posX - prePosX);
    		int disY = Math.abs(posY - prePosY);
    		int disTime = Math.abs(time - preTime);
    		//check the distance
    		if(disTime < (disX + disY)) {
    			okFlag = false;
    			break;
    		}
    		
    		//check the avaible position
    		if(disTime%2 != (disX + disY)%2) {
    			okFlag = false;
    			break;
    		}
    		
    		prePosX = posX;
    		prePosY = posY;
    		preTime = time;
    		
    	}
    	if(okFlag) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    	
    	
    }
}