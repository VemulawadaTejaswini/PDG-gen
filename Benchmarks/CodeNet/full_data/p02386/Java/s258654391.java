
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	;
        Scanner sc = new Scanner(System.in);
        int i, j, k, n;
        boolean flag = true;
        n = sc.nextInt();
        Dice[] d = new Dice[n];
        
        for(i = 0; i < n; i++)
        	d[i] = new Dice();
        
        for(i = 0; i < n; i++) {
        	for(j = 0; j < 6; j++)
        		d[i].x[j] = sc.nextInt();
        }
        
        for(i = 0; i < n-1; i++) {
        	for(j = i+1; j < n; j++) {
        		flag = comparison(d[i], d[j]);
        		if(flag == true) {
        			System.out.println("No");
        			return;
        		}
        	}
        }
        System.out.println("Yes");
    }
    
    public static boolean comparison(Dice a, Dice b) {
    	int copy[] = new int[6];
    	boolean flag = true;
    	
    	System.arraycopy(a.x,0,copy,0,a.x.length);
    	
    	for(int i = 0; i < 6; i++) {
    		
    		System.arraycopy(copy,0,a.x,0,copy.length);
    		switch(i) {
    		case 1: a.roll('E'); break;
    		case 2: a.roll('S'); break;
    		case 3: a.roll('W'); break;
    		case 4: a.roll('N'); break;
    		case 5: a.roll('E'); a.roll('E'); break;
    		}
    		
    		for(int j = 0; j < 4; j++) {
    			
    			int tmp;
    	    	tmp = a.x[1];
    	    	a.x[1] = a.x[2];
    	    	a.x[2] = a.x[4];
    	    	a.x[4] = a.x[3];
    	    	a.x[3] = tmp;
    	    	
    	    	/*
    	     	for(int k = 0; k < 6; k++) {
    	    		System.out.println(a.x[k] + " " + b.x[k]);
    	    	}
    	    	*/
    	    	
    			for(int k = 0; k < 6; k++)
        			if(a.x[k] != b.x[k]) flag = false;
    			if(flag == true) return true;
    			else flag = true;
    		}
    	}
    	return false;
    }
    
    
    public static int solve(int a, int b, int dice[]) {
    	int ans = -1;
    	if(a == dice[0] || a == dice[5])
    		if(b == dice[1]) 
    			ans = dice[2];
    		else if(b == dice[2]) 
    			ans = dice[4];
    		else if(b == dice[4]) 
    			ans = dice[3];
    		else
    			ans = dice[1];
    	else if(a == dice[1] || a == dice[4])
    		if(b == dice[2])
    			ans = dice[0];
    		else if(b == dice[0])
    			ans = dice[3];
    		else if(b == dice[3])
    			ans = dice[5];
    		else
    			ans = dice[2];
    	else if(a == dice[2] || a == dice[3])
    		if(b == dice[0])
    			ans = dice[1];
    		else if(b == dice[1])
    			ans = dice[5];
    		else if(b == dice[5])
    			ans = dice[4];
    		else
    			ans = dice[0];
    	
    	if(a == dice[5])
    		ans = dice[0] + dice[5] - ans;
    	else if(a == dice[4])
    		ans = dice[0] + dice[5] - ans;
    	else if(a == dice[3])
    		ans = dice[0] + dice[5] - ans;
    	
    	return ans;
    }
}


class Dice{
	public int x[] = new int[6];
	int tmp1, tmp2;
	
	public void roll(char direction) {
		switch(direction) {
		case 'E':
			tmp1 = x[0];
    		x[0] = x[3];
    		tmp2 = x[2];
    		x[2] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[3] = tmp1;
    		return;
    		
		case 'S':
			tmp1 = x[0];
    		x[0] = x[4];
    		tmp2 = x[1];
    		x[1] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[4] = tmp1;
    		return;
		
		case 'W':
			tmp1 = x[0];
    		x[0] = x[2];
    		tmp2 = x[3];
    		x[3] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[2] = tmp1;
    		return;
    		
		case 'N':
			tmp1 = x[0];
    		x[0] = x[1];
    		tmp2 = x[4];
    		x[4] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[1] = tmp1;
    		return;
		}
	}
}
