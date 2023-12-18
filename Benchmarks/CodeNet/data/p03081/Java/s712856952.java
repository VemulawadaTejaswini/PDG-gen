import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numOfSpell = sc.nextInt();
        String blank = sc.nextLine();
        String str = sc.nextLine();

        //System.out.print("num:"+num+"numOfSpell:"+numOfSpell+"str:"+str);
        ArrayList<Integer> golem = new ArrayList<>();
        int count = 0;
        String tidi = "";

        for(int i=0; i<num+2; i++){
            golem.add(1);
        }

        for(int i=0; i<numOfSpell; i++){
            tidi = sc.nextLine();
    
            //System.out.println("tidi:"+tidi+",");
            //System.out.println("di:"+di+",");
            for(int j=0; j<num; j++){
                if(str.charAt(j) == tidi.charAt(0)){
                    if(tidi.charAt(2) == 'L'){
                        golem.set(j, golem.get(j)+golem.get(j+1));
                    }
                    else if(tidi.charAt(2) == 'R'){
                        golem.set(j+2, golem.get(j+2)+golem.get(j+1));
                    }
                    golem.set(j+1, 0);
                }
            }
        }
        
        for(int i=1; i<num+1; i++){
            count += golem.get(i);
        }
        
        System.out.println(count);
    }
}