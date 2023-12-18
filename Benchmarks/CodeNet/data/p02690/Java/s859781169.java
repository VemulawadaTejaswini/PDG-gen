import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> fact5 = getFact5();
        for(int i = 0; i <= 100000; i++){
            for(int j = 0; j <= 10000; j++){
                int chk = fact5.get(i);
                int chk2 = fact5.get(j);
                if(chk + chk2 == x){
                    System.out.println(i + " " + -j);
                    return;
                }else if(chk - chk2 == x){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
    
    public static ArrayList<Integer> getFact5(){
        int n = 100000;
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i <= n; i++){
            int chk = (int)Math.pow(i,5);
            li.add(chk);
        }
        return li;
    }
}
