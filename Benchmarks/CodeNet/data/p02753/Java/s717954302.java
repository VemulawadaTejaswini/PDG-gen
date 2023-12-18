import java.util.*;

class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){

            //int ans = Integer.valueOf(sc.next());
            String input1 = sc.next();
            String input2 = sc.next();
            String input3 = sc.next(); 

            if(input1.equals(input2) && input1.equals(input3)){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }


        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}