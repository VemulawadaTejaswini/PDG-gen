import java.util.*;
public class Main{
    static int init;
    static int goal;
    static int calc(int init, int goal){
        int ret = 0;
        if(goal * init < 0){
            ret = Math.abs(goal + init) + 1;
        }
        else if(init > 0 && goal > 0){
            if(init > goal){
                ret = init - goal + 2;
            }else{
                ret = goal - init;
            }
        }else{
            ret = calc(-goal, -init);
        }
            
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int init;
        int goal;

        init = Integer.parseInt(sc.next());
        goal = Integer.parseInt(sc.next());
        System.out.println(calc(init, goal));
        
    }
}