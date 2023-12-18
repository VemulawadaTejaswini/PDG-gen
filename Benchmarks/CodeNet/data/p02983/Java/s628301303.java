import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,r;
        l = sc.nextInt();
        r = sc.nextInt();

        int min = Integer.MAX_VALUE;

        for(int i=l;i<r;i++){
            for(int j=l;j<r;j++){
                if(i<j){
                    if(min>(i*j)%2019){
                        min = (i*j)%2019;
                    }
                }
            }
        }

        if(min==Integer.MAX_VALUE){
            min =  l*r;
        }

        System.out.println(min);
    }
}