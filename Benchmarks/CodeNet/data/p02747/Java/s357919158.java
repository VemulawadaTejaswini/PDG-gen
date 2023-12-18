import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);
        
        ){
 
            Stirng hitachi = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 5; i++){
                sb.append("hi");
                if(hitachi.equals(sb.toString())){
                    System.out.println(Yes);
                }else if(i == 4){
                    System.out.println(No);
                }
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}