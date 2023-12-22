import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int hpT = Integer.parseInt(sc.next());
            int atkT = Integer.parseInt(sc.next());
            int hpA = Integer.parseInt(sc.next());
            int atkA = Integer.parseInt(sc.next());

            String win = ""; 

            while(hpT > 0 && hpA > 0){
                hpA -= atkT;
                if(hpA <= 0){
                    win = "takahashi";
                    break;
                } 

                hpT -= atkA;
                if(hpT <= 0){
                    win = "aoki";
                    break;
                }
            }

            if(win.equals("takahashi")) System.out.println("Yes");
            else if(win.equals("aoki")) System.out.println("No");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}