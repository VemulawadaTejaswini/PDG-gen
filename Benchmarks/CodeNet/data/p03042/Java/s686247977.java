import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String target = sc.next();
        String target1 = target.substring(0,2);
        String target2 = target.substring(2);
        
        
        if(target1.equals("00") || target2.equals("00")){
            System.out.println("NA");
            return;
        }
        
        int targetInt1 = Integer.parseInt(target1);
        int targetInt2 = Integer.parseInt(target2);
        
        if(targetInt1 <= 12){
            if(targetInt2 <= 12){
                System.out.println("AMBIGUOUS");
            }else{
                System.out.println("MMYY");
            }
        }else{
            if(targetInt2 <= 12){
                System.out.println("YYMM");
            }else{
                System.out.println("NA");
            }
        }
        
    }
}
