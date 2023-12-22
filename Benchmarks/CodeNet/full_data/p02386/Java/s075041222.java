import java.util.Scanner;


/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int diceO[][];
		int diceC[][];
		int n = 0;
		int num1;
		int num2 = 1;
		String str = "";
		Boolean breakp = null;
		
		n = as.nextInt();
		
		diceO = new int[n][6];
		diceC = new int[n][6];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<6;j++){
				
				diceO[i][j] = as.nextInt();
				
			}
		}
		diceC = diceO;
		for(num1=0;num1<n;num1++){
			for(num2=num2+num1;num2<n;num2++){
				
				breakp = Spin.DoubleCheck(diceO, diceC, num1, num2);
				
				if(breakp){
					
					str = "No";
					break;
					
				}
				else{
					
					str = "Yes";
					
				}
				
				
			}
			if(breakp){
				
				break;
				
			}
		}
		
		
		
		
		System.out.println(str);

	}

}

class Spin{
	
	public static int[][] diceSpin(int[][] dice,String spn,int num2) {
	
		int tre = 0;	
			
		switch (spn){
		case "x":
			tre = dice[num2][4];
			dice[num2][4] = dice[num2][0];
			dice[num2][0] = dice[num2][1];
			dice[num2][1] = dice[num2][5];
			dice[num2][5] = tre;
			break;
			
		case "y":
			tre = dice[num2][3];
			dice[num2][3] = dice[num2][0];
			dice[num2][0] = dice[num2][2];
			dice[num2][2] = dice[num2][5];
			dice[num2][5] = tre;
			break;
			
		case "z":
			tre = dice[num2][2];
			dice[num2][2] = dice[num2][1];
			dice[num2][1] = dice[num2][3];
			dice[num2][3] = dice[num2][4];
			dice[num2][4] = tre;
			break;
					
		}
			
		return dice;
		
	  }
	
	public static Boolean Samecheck(int[][] dice1,int[][] dice2,int num1,int num2){
		
		Boolean flag = null;
		
		for(int i=0;i<6;i++){
			
			if(dice1[num1][i] != dice2[num2][i]){
				
				flag = false;
				break;
			}
			else{
				
				flag = true;
				
			}
			
		}
		
		return flag;
		
	}
	
	public static Boolean Check(int[][] dice1,int[][] dice2,int sp,int num1,int num2){
		
		Boolean flag = null;
		String spn = null;
		
		switch (sp){
		case 0:
			spn = "x";
			break;
			
		case 1:
			spn = "y";
			break;
			
		case 2:
			spn = "z";
			break;
			
		}
		
		for(int j=0;j<4;j++){		
			
			dice2 = Spin.diceSpin(dice2, spn,num2);
			if(Spin.Samecheck(dice1, dice2,num1,num2)){
				
				flag = true;
				break;
			
			}
			
			flag = false;
			
		}
		
		return flag;
		
	}
	
	public static Boolean DoubleCheck(int[][] dice1,int[][] dice2,int num1,int num2){
		
		Boolean breakp = null;
		
		for(int i=0;i<3;i++){
			
			for (int j=0;j<4;j++){
				
				for(int k=0; k<j; k++){
					
					dice2 = Spin.diceSpin(dice2, "x",num2);
					
				}
				
				breakp = Spin.Check(dice1, dice2, i,num1,num2);
				
				if(breakp == true){
					
					break;
					
				}
				
			}
			
			if(breakp == true){
				
				break;
				
			}
		
		}
		
		return breakp;
		
	}
	
}