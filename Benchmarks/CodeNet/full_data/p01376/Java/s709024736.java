import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int participant = Integer.parseInt(sc.next());
        int issue = Integer.parseInt(sc.next());
        
        int max=0;
        for(int i=0; i<participant; i++){
            int sum = 0;
            for(int j=0; j<issue; j++){
                sum += Integer.parseInt(sc.next());
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }

}

