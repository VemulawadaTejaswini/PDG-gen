import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();
        int count = 0;
        if(N < 357)
            System.out.println(0);
        else{
            for(int i = 357; i <= N; i=i+20){
                if(judge753_1(i) && judge753_2(i))
                    count++;
            }
            for(int i = 375; i <= N; i=i+20){
                if(judge753_1(i) && judge753_2(i))
                    count++;
            }
            for(int i = 573; i <= N; i=i+20){
                if(judge753_1(i) && judge753_2(i))
                    count++;
            }
            System.out.println(count);
        }
    }

    static boolean judge753_1(int N){
        String s = Integer.toString(N);
        if(s.contains("3") && s.contains("5") && s.contains("7"))
            return true;
        else
            return false;
    }
    static boolean judge753_2(int N){
        while(N > 0){
            if(N%10 == 3 || N%10 == 5 || N%10 == 7){
                N = N/10;
            } else
                return false;
        }
        return true;
    }
}