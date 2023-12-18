import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] ryuka=new long[87];
        ryuka[0]=2;
        ryuka[1]=1;
        for(int i=2;i<87;i++){
            ryuka[i]=ryuka[i-1]+ryuka[i-2];
        }
        System.out.println(ryuka[sc.nextInt()]);
    }
}
