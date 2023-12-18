import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        
        int b = in.nextInt();
        
        ArrayList list1 = new ArrayList();
        
        ArrayList list2 = new ArrayList();
        
        for(int i=1; i<=a ;i++){
            
            list1.add(i);
        }
        
        for(int i=1; i<=b ; i++){
            
            list2.add(i);
        }
        
        if(a<b){
            list2.removeAll(list1);
            System.out.println(b-list2.size());
        }
        else if(a>b){
            list1.removeAll(list2);
            System.out.println(a-list1.size());
        }
        else{
            list1.removeAll(list2);
            System.out.println(a-list1.size());
        }
        
      
            
    }
    
}
