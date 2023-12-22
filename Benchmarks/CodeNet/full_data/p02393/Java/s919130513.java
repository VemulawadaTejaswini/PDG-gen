import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] x={scan.nextInt(),scan.nextInt(),scan.nextInt()};
        if(x[0]>x[1]){
            x[0]^=x[1];
            x[1]^=x[0];
            x[0]^=x[1];
        }
        if(x[1]>x[2]){
            x[1]^=x[2];
            x[2]^=x[1];
            x[1]^=x[2];
        }
        if(x[0]>x[1]){
            x[0]^=x[1];
            x[1]^=x[0];
            x[0]^=x[1];
        }
        System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}
