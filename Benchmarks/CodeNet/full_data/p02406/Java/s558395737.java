
import java.util.Scanner;

class Main {
    public static void main(String args[]){
		
	//整数nを読み取る
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
        int n = Integer.parseInt(s1);
        
        //nが条件（３から１００００）内か確認
        if(3 <= n && n <= 10000){
        	
        	//１からnまで繰り返す
        	for(int i = 1; i <= n; i++){
        		
        		//３の倍数と３とつく数字を表示
                        //3の倍数
        		if(i % 3 == 0){
        			System.out.print(" " + i);
        		}
　　　　　　　　　　　　//1の位に3がある
        		else if(i % 10 == 3){
        			System.out.print(" " + i);
        		}
        		else{
        			for(int j = 1; j <= 9; j++){
                                        //10の位に3がある
        				if(i / (j * 10) == 3){
        					System.out.print(" " + i);
        					break;
        				}
                                        //100の位に3がある
        				else if(i / (j * 100) == 3){
        					System.out.print(" " + i);
        					break;
        				}
                                        //1000の位に3がある
        				else if(i / (j * 1000) == 3){
        					System.out.print(" " + i);
        					break;
        				}
        			}
        		}
        	}
        	System.out.println("");
        }
    }
}