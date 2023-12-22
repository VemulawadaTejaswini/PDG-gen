import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> fact5 = getFact5(x);
        int i = 0;
        for(int a : fact5){
            int j = 0;
            for(int b : fact5){
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
    
    public static ArrayList<Integer> getFact5(int n){
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i <= 120; i++){
            int chk = (int)Math.pow(i,5);
            li.add(chk);
        }
        return li;
    }
    
    
}
