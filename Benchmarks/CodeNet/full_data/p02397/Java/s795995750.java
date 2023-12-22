import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        List<Integer> listx = new ArrayList<>();
        List<Integer> listy = new ArrayList<>();      
        
       while(true){
           
            int x = sc.nextInt();
            int y = sc.nextInt();
           
            if(x == 0 && y==0) break;
            
            listx.add(x);
            listy.add(y);
           
       }
       
       for(int i=0;i<listx.size();i++){
           check(listx.get(i),listy.get(i));
       }
       

        
    }
    
    public static void check(int x,int y){
              if(x<y){
                  System.out.println(x+" "+y);
              } else if(x>y){
                  System.out.println(y+" "+x);
              }else if(x == 0 && y==0){
                  
              }else{
                  System.out.println(x+" "+y);
              }
          }
}
       


