import java.util.*;
public class Main{
    
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int[]x=new int [3];
        for(int i=0;i<x.length;i++){
            x[i]=in.nextInt();
        }
        Arrays.sort(x);
        System.out.println(x[0]+" "+x[1]+" "+x[2]);
        in.close();

    }    
}
