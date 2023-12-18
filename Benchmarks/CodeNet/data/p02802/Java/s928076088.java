import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> good = new HashSet<>();
        int count = 0;
        for(int i =0;i<m;i++){
            Integer p = sc.nextInt();
            String acwa = sc.next();
            if(acwa.equals("AC")){
                good.add(p);
            }
            else{
                if(!good.contains(p)){
                    count++;
                }
            }
        }
        System.out.println(good.size() + " " + count);
        
    }
}
