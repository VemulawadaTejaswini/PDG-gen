import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>X=new ArrayList<>();
        for(int i=0;i<N;i++){
            X.add(sc.nextInt());
        }
        for(int i=0;i<N;i++){
            ArrayList<Integer>Y=new ArrayList<>(X);
            Y.remove(i);
            Collections.sort(Y);
            System.out.println(Y.get(N/2-1));


        }

        


}
        
        
    }
