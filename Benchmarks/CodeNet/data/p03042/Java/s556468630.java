import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int hidari = S%100;
    int migi = (S-hidari)/100;
    
    if(migi==0 || hidari==0) {
    	System.out.println("NA");
    }else if(migi>12 && hidari>12) {
    	System.out.println("NA");
    }else if(migi<=12 && hidari<=12) {	
    System.out.println("AMBIGUOUS");
    }else if(migi<=12 && hidari>12) {	
    System.out.println("MMYY");
    }else {
    System.out.println("YYMM");
    }
}
}