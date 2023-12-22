import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            String dec = Integer.toBinaryString(n);
            for(int i=dec.length()-1; i>=0; i--){

                if(Integer.parseInt(dec.substring(i,i+1))==1){
                    //System.out.println("substring;"+dec.substring(i,i+1));           
                    System.out.print((int)Math.pow(2,dec.length()-1-i)+" ");
                }
            }
             System.out.println();
        }
    }
}





