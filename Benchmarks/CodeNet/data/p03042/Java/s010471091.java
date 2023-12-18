import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	String[] spl = line.split("");
    	spl[0] += spl[1];
    	spl[2] += spl[3];

    	int fir = Integer.parseInt(spl[0]);
    	int sec = Integer.parseInt(spl[2]);

    	if(fir == 0 || sec == 0){
    		System.out.println("NA");
    		System.exit(0);
    	}

    	if(0 < fir && fir <= 12 && 0 < sec && sec <= 12){
    		System.out.println("AMBIGUOUS");
    	}else if(0 < fir && fir <= 12){
    		System.out.println("MMYY");
    	}else{
    		System.out.println("YYMM");
    	}

    }
}