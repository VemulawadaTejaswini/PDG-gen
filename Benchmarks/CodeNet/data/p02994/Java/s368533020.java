import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=scan.nextInt();
        int l=scan.nextInt();
        ArrayList<Integer> S=new ArrayList<>();
        ArrayList<Integer> absS=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            S.add(l+i);
            absS.add(Math.abs(l+i));
        }

        int minIndex=absS.indexOf(Collections.min(absS));
        S.set(minIndex,0);
        
        int sum=0;
        for(int d : S){
            sum+=d;
        }
        System.out.print(sum);



    }
}