import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String str = "";
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        if(N < 1 || N > 100000)
            System.exit(1);
        
        
        else{
            for(int i = 0; i < N;i++){
                str = sc.nextLine();
                if(Integer.parseInt(str) < 1 || Integer.parseInt(str) > 100000000){
                    System.exit(1);
                }
                if(ar.contains(Integer.parseInt(str))){
                    ar.remove(ar.indexOf(Integer.parseInt(str)));
                }
                else{
                    ar.add(Integer.parseInt(str));
                }
            }
        }
        
        System.out.println(ar.size());
    }
}