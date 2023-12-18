import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );


        int varN   = Integer.parseInt(scan.next());
        int kill   = Integer.parseInt(scan.next());
        ArrayList<Integer> health = new ArrayList<Integer>();

        for(int i=0; i<varN; i++){
            health.add( Integer.parseInt( scan.next() ) );
        }

        if(varN <= kill){
            System.out.println(0);
        }else{    
            Collections.sort(health);
            Collections.reverse(health);
    
            health.subList(0,kill).clear();

            varN -= kill;
            long attack = 0;
            for(int i=0; i<varN; i++){
                attack += health.remove(0);
            }
            System.out.println(attack);
        }

    }
}