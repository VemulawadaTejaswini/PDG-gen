import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        ArrayList<Long> fact5 = getFact5();
        for(int i = 0; i <= 10000; i++){
            for(int j = 0; j <= 10000; j++){
                long chk = fact5.get(i);
                long chk2 = fact5.get(j);
                if(chk + chk2 == x){
                    System.out.println(i + " " + -j);
                    return;
                }else if(chk - chk2 == x){
                    System.out.println(i + " " + j);
                    return;
                }else if(-chk + chk2 == x){
                    System.out.println(-i + " " + -j);
                    return;
                }else if(-chk - chk2 == x){
                    System.out.println(-i + " " + j);
                    return;
                }
            }
        }
    }
    
    public static ArrayList<Long> getFact5(){
        int n = 10000;
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i <= n; i++){
            long chk = (long)Math.pow(i,5);
            li.add(chk);
        }
        return li;
    }
}
