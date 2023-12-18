import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int prev = sc.nextInt();
        int direction = 0;
        int cut = 0;
        for(int i=1;i<N;i++){
        	int cur = sc.nextInt();
        	switch(direction){
        		case 0:// -
        			if(cur>prev) direction = 1;
        			else if(cur<prev)direction = -1;
        			else direction = 0;
        			break;
        		case 1:// /
        			if(cur<prev){
        				cut++;
        				direction = 0;
        			}break;
        		case -1:
        			if(cur>prev){
        				cut++;
        				direction = 0;
        			}break;
        	}
        	prev=cur;
        }
        System.out.println(1+cut);
    }
}