import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        //int d1 = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        boolean flag = false;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        int minko = x / 105;
        int maxko = x / 100 + 1;
        
        for(int i = minko; i <= maxko; i++){
        	int amari = x - (i * 100);
        	
        	if(amari >= 0 && amari <= 5 * i){
        		flag = true;
        		break;
        	}
        }
        
        if(flag){
        	System.out.println(1);
        }else{
        	System.out.println(0);
        }
        
        
        //System.out.println();
        //System.out.print();
    }
}