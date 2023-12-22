import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] hand = new int[5];
        boolean rock=false;
        boolean scissors=false;
        boolean paper=false;
        boolean bCheck=true;
        while(bCheck){
        	for(int i=0;i<5;i++){
        		hand[i]=Integer.parseInt(br.readLine());
        		if(hand[i]==1)rock=true;
        		else if(hand[i]==2)scissors=true;
        		else if(hand[i]==3)paper=true;
        		else if(hand[i]==0){
        			bCheck=false;
        			break;
        		}
        	}
        	if(rock&&scissors&&paper){
        		for(int i=0;i<5;i++)System.out.println("3");
        	}else if(rock&&scissors&&!paper){
        		for(int i=0;i<5;i++){
        			System.out.println(hand[i]);
        		}
        	}else if(rock&&!scissors&&paper){
        		for(int i=0;i<5;i++){
        			if(hand[i]==1)System.out.println("2");
            		else System.out.println("1");	
        		}
        		
        	}else if(!rock&&scissors&&paper){
        		for(int i=0;i<5;i++){
        			if(hand[i]==2)System.out.println("1");
        			else System.out.println("2");
        		}
        	}
        	rock=false;
        	scissors=false;
        	paper=false;
        }
    }
}