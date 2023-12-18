import java.util.*;

class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            double per8 = Integer.valueOf(sc.next());
            double per10 = Integer.valueOf(sc.next());

            double ans1 = Math.floor(per8/0.08);
            double ans2 = Math.floor(per10/0.1);

            if(ans1 == ans2){
                System.out.println(ans1);
            }else if(ans1 + 1 == ans2){
                System.out.println(ans2);
            }else if(ans1 == ans2 + 1){
                System.out.println(ans1);
            }else{
                System.out.println(-1);
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}