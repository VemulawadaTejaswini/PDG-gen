import java.util.Scanner;

public class Main{
    
    static Scanner sc = new Scanner(System.in);
     
    public static void main(String[]args){
        while(true){
          String deck = sc.nextLine();  
            if (deck.equals("-")) {
                break;
            }
       
      

           String n = sc.nextLine();
           int numb = Integer.valueOf(n);
           String arr[] = new String [numb+1];
           arr[0] = deck;
            for (int i = 0; i < numb; i++) {
                  String a = sc.nextLine();
                  int index = Integer.valueOf(a);
                  String sub = arr[i].substring(0, index);
                  String remains = arr[i].substring(index,arr[i].length());
                  String newString = remains.concat(sub);
             
                  arr[i+1] = newString;
            }
            System.out.println(arr[numb]);
        }
        
    }
}
