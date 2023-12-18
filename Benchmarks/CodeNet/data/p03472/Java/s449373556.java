import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] katanaSwing = new int[N];
        int[] katanaThrow = new int[N];
        
        for(int n=0;n<N;n++){
        	katanaSwing[n] = sc.nextInt();
        	katanaThrow[n] = sc.nextInt();
        }
        Arrays.sort(katanaSwing);
        Arrays.sort(katanaThrow);
        
        int attack = 0;
        int bestKatana = N-1;
        while(H>0){
        	if(bestKatana>=0 && katanaThrow[bestKatana]>katanaSwing[N-1]){
        		H -= katanaThrow[bestKatana];
        		attack++;
        		bestKatana--;
        	}else{
        		attack += (H/katanaSwing[N-1]) + (H%katanaSwing[N-1]==0 ? 0 : 1);
        		H=0;
        	}
        }
        System.out.println(attack);
    }
}