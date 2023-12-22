import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] x={scan.nextInt(),scan.nextInt(),scan.nextInt()};
        int j=0;
        
        for(int i=x[0];i<=x[1];i++){
            if(x[2]%i==0)j++;
        }
        System.out.println(j);
    }
}
