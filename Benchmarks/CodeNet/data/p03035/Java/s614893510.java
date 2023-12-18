import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int cost = input.nextInt();
        AtCoder_Beginner_127_Task_A atCode_127_A = new AtCoder_Beginner_127_Task_A();
        System.out.println(atCode_127_A.calFee(age,cost));
    }
}

class AtCoder_Beginner_127_Task_A{
    public int calFee(int age, int cost){
        
        if(age <= 5)
            return 0;
        
        if(age <=12)
            return cost/2;
        
        return cost;
        
    }
}