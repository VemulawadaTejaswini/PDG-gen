import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int p;
        String s;
        int pena = 0;

        Set<Integer> OK = new HashSet<Integer>();

        for(int i = 0 ; i < m ; i++){
            p = sc.nextInt();
            s = sc.next();

            if(s.equals("WA")){
                pena++;
            }else{
                OK.add(p);
            }
        }
        int ok = OK.size();
        System.out.print(ok + " "+pena);

    }
}