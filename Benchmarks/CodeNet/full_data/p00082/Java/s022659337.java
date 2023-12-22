
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0076().doIt();
    	}
    }
    class aoj0076{
    	int set[][] = {{1,4,1,4,1,2,1,2},
    			{2,1,4,1,4,1,2,1},
    			{1,2,1,4,1,4,1,2},
    			{2,1,2,1,4,1,4,1},
    			{1,2,1,2,1,4,1,4},
    			{4,1,2,1,2,1,4,1},
    			{1,4,1,2,1,2,1,4},
    			{4,1,4,1,2,1,2,1}};
    	void doIt(){
    		int a[] = new int [8];
    		for(int i = 0;i < 8;i++)a[i] = sc.nextInt();
    		int ans = 0;int num = Integer.MAX_VALUE;
    		for(int i = 0;i < 8;i++){
    			int num2 = 0;
    			for(int j = 0;j < 8;j++){
    				if(a[j] - set[i][j] > 0)num2 += a[j] - set[i][j];
    			}
    			if(num > num2){
					num = num2;
					ans = i;
				}
    		}
    		for(int i = 0;i < 7;i++){
    			System.out.print(set[ans][i]+" ");
    		}
    		System.out.println(set[ans][7]);
    	}
    }
}