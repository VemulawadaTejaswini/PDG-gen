import java.util.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long height = sc.nextLong();
            long width = sc.nextLong();

            long ans = 0;

            if(height % 2 == 0 || width % 2 == 0){
                ans = height * width / 2;
            }else{
                ans = (height * width + 1) / 2;
            }

            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}