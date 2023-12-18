import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	boolean flg = true;
      	for(int i=1;i<=100;i++){
        	for(int j=1;j<=100;j++){
            	if(N==7*i+4*j){
                	System.out.println("Yes");
                  	flg = false;
                  	break;
                }
            }
        }
        if(flg){
        	System.out.println("No");
        }
    }
}