import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
 //       Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cardAbc;
        int cardNum;//カードの枚数
        int shuffleNum;//シャフルする枚数
        int shuffleTimes;//シャフルする回数

//  ArrayList<String> cardArray = new ArrayList<String>();
        String copy = "";
        
        while((cardAbc = br.readLine()) != null){
            if("-".equals(cardAbc)){
                break;
//            shuffleTimes= Integer.parseInt(br.readLine());
//            cardNum = cardAbc.length();
 //           String[] card = new String[cardNum];
 //           card = cardAbc.split("");
//            for(String a:cardAbc){
            }else{
             cardNum = cardAbc.length();
        //    System.out.println("cardAbc" + cardAbc);
        //    System.out.println("cardNum" + cardNum);                
                 shuffleTimes = Integer.parseInt(br.readLine());
        //    System.out.println("shuffleTimes" + shuffleTimes);
                
                 for(int i = 0; i <shuffleTimes;i++){
                     shuffleNum = Integer.parseInt(br.readLine());
                     copy += cardAbc.substring(shuffleNum,(cardAbc.length())); 
                 //    System.out.println("copy" + i + copy);                    
                     copy += cardAbc.substring(0,shuffleNum);
                //     System.out.println("copy" + i + copy);

                     cardAbc = copy;
                     copy ="";
                 }//System.out.println("ans" + cardAbc);
                 System.out.println(cardAbc);
 
            }
        }
    }
}
                 

