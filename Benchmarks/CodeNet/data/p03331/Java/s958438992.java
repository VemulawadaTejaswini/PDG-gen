
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N=scanner.nextInt();
        int min=Integer.MAX_VALUE;
        for(int A=1;A<N/2+1;A++){
            int current=func(A)+func(N-A);
            if(min>current){
                //System.out.println("A="+A+",min="+min+",current="+current);
                min=current;
            }
        }
        System.out.println(min);

    }
    public static int func(int A){
        int result=0;
        while(true){
            result+=A-A/10*10;
            A=A/10;
            if(A==0) break;
        }
        return  result;
    }
}