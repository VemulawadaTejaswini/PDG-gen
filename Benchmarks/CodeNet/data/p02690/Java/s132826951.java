import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        ArrayList<Long> fact5 = getFact5(x);
        int i = 0;
        for(long a : fact5){
            int j = 0;
            for(long b : fact5){
                if(a+b == x){
                    System.out.println(i + " " + -j);
                    return;
                }else if(a-b==x){
                    System.out.println(i + " " + j);
                    return;
                }else if(-a+b == x){
                    System.out.println(-i + " " + j);
                    return;
                }else if(-a-b == x){
                    System.out.println(-i + " " + -j);
                    return;
                }
                j++;
            }
            i++;
        }
    }
    
    public static ArrayList<Long> getFact5(long n){
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i <= 120; i++){
            long chk = (long)Math.pow(i,5);
            li.add(chk);
        }
        return li;
    }
    
    
}
