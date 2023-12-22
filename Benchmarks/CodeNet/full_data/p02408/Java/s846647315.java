import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = Integer.parseInt(str);
 
        String inputList[] = new String[n];
        for (int i = 0; i < n; i++) {
            String str2 = scan.nextLine();
            inputList[i] = str2;
        }
        scan.close();
 
        ArrayList<String> allCardList[][] = new ArrayList<String>();
        
        
        String [][] ali = new String[4][13];
        String Card[]= {"S","H","C","D"};
        
        for ( int i=0;i<4 ; i++>){
        	ali[i][]= Card[i];
        	
        	for(int j= 0;j<52;j++){
        		ali[][j]= j+1 ;
        	}
//
//    for (int i =0; i<52;i++){
//    	if (! )
//    }
        
        for (int i = 1; i <= 13; i++) {
            allCardList.add("S" + " " + i);
        }
        for (int i = 1; i <= 13; i++) {
            allCardList.add("H" + " " + i);
        }
        for (int i = 1; i <= 13; i++) {
            allCardList.add("C" + " " + i);
        }
        for (int i = 1; i <= 13; i++) {
            allCardList.add("D" + " " + i);
        }
 
        for (int i = 0; i < 52; i++) {
            if (!(Arrays.asList(inputList).contains(allCardList.get(i)))) {
                System.out.println(allCardList.get(i));
            }
        }
    }
}