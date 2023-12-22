import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();   
        
        list.add(sc.nextInt());
        
        int x=0;
        
        while(true){
            
            list.add(sc.nextInt());
            x++;
            
            if(x == list.get(0)){
                break;
            }
            
            
        }
            
        
        
        for(int i=list.size()-1; i>0; i--){
            System.out.print(list.get(i));
            if(i != 1) System.out.print(" ");
                            
        }
           System.out.println("");
        }           
    }



        
    

       

   


