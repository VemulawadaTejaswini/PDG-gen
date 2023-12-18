import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    //male=1, female=-1, vacant=0
    public static int ask(int seatNum){
    	System.out.println(seatNum);
    	String s = sc.next();
    	if(s.equals("Male")) return 1;
    	else if(s.equals("Female")) return -1;
    	else System.exit(0);//vacant
    	return -255;
    }
    
    //seat[vMin]==seat[vMax]==eS
    //assert vMin%2 != vMax%2
    public static void search(int edgeMin, int edgeMax, int edgeSex){
    	System.out.println(edgeMin+" "+edgeMax+" "+(edgeSex==1?"M":"F"));
    	//you have found the vacant seat
    	if(edgeMax-edgeMin<=4){
    		for(int i=edgeMin+1;i<edgeMax;i++) ask(i);
    	}
    	
    	int midSeat = (edgeMin+edgeMax)/2;
    	int midSex = ask(midSeat);
    	if((midSeat-edgeMin)%2==0 && edgeSex==midSex){
    		search(midSeat,edgeMax,edgeSex);
    	}else
    	if((midSeat-edgeMin)%2==0 && edgeSex!=midSex){
    		search(edgeMin,midSeat+1,edgeSex);
    	}else
    	if((midSeat-edgeMin)%2==1 && edgeSex==midSex){
    		search(edgeMin,midSeat,edgeSex);
    	}else
    	if((midSeat-edgeMin)%2==1 && edgeSex!=midSex){
    		search(midSeat-1,edgeMax,edgeSex);
    	}
    }
    
    public static void main(String[] args) {
        
        int N = sc.nextInt();
        int firstSeat = ask(0);
        search(0,N,firstSeat);
    }
}