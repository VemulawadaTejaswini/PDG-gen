import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in);   
  
        int H = kb.nextInt();
        int I = H/10;
	
	for(int j=I;j<=H;j=j+I){
	    System.out.print(" "+j);
	}
	System.out.println();
    }
}