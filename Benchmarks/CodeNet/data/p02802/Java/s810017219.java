import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        //numbers of problems
        int N = sc.nextInt();
        
        //numbers of submission
        int M = sc.nextInt();
        
        int[] ac = new int[N];
        int[] pena = new int[N];
        boolean[] flg = new boolean[N];
        
        for(int i = 0; i <= M-1; i++) {
        	int a = sc.nextInt();
        	String s = sc.next();
        	a--;
        	flg[a] = false;
        	if(flg[a])continue;
        	if(s == "AC") {
        		flg[a] = true;
        		ac[a] = 1;
        	}else {
        		pena[a]++;
        	}
        }
        int waCount = 0, acCount = 0;
        for(int i = 0; i < N; i++) {
        	if(flg[i])waCount += pena[i];
        	acCount += ac[i];
        }
        System.out.println(waCount);
        System.out.println(waCount);
        
    }
    }