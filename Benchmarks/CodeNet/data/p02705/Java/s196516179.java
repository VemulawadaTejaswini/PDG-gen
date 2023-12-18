    import java.util.*;
         
    class Main{
        public static void main(String[] args) {
            
            try(Scanner sc = new Scanner(System.in)){
                int r = Integer.parseInt(sc.next());
                double pi = Math.PI;
     
                System.out.println(2 * (double)r * pi);
     
            }catch(Exception e){
                e.printStackTrace();
            }        
        }
    }