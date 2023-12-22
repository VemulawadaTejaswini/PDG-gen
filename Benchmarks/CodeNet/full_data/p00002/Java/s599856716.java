import java.util.ArrayList;
import java.util.Scanner;

class Digit{

	private static final int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,99999999, 999999999, Integer.MAX_VALUE };
	public int digit;

	public Digit(int a,int b){digit = calc_digit(a+b);}

	private int calc_digit(int x){
        for (int i=0;;i++){if (x <= sizeTable[i]){return i+1;}}
 	}
}

public class Main {

    public static void main(String[] args) {

    	ArrayList<Digit> Ar = new ArrayList<Digit>();

        //input
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	Ar.add(new Digit(sc.nextInt(),sc.nextInt()));
        }

        //output
        for(Digit d:Ar){System.out.println(d.digit);}
    }
}