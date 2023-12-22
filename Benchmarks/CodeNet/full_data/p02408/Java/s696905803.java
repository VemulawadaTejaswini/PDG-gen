import java.util.*;
      
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[53];
        
        for(int i = 1;i <= n;i++){
        	String mark = sc.next();
        	int num = sc.nextInt();
        	if(mark.equals("S")){
        		card[num] = 1;
        	}else if(mark.equals("H")){
        		card[num + 13] = 1;
        	}else if(mark.equals("C")){
        		card[num + 26] = 1;
        	}else if(mark.equals("D")){
        		card[num + 39] = 1;
        	}
        	//System.out.println(card[i]);
        }
        
        for(int i = 1;i <= 52;i++){
        	if(card[i] == 0){
        		if(1 <= i && i <= 13){
        			System.out.println("S "+ i);
        		}else if(14 <= i && i <= 26){
        			System.out.println("H " + (i - 13));
        		}else if(27 <= i && i <= 39){
        			System.out.println("C "+(i - 26));
        		}else if(40 <= i && i <= 52){
        			System.out.println("D "+(i - 39));
        		}
        	}
        }
    }
}