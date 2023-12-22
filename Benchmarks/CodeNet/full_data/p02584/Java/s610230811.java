import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long X=Math.abs(sc.nextLong()),K=sc.nextLong(),D=sc.nextLong(),end=0,endl=0;
        if(K>X/D){
            if(X-(X/D)*D<((X/D)+1)*D-X){
                end=X-(X/D)*D;
                endl=D-end;
                if((K-X/D)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }else{
                endl=X-(X/D)*D;
                end=D-endl;
                if((K-(X/D)-1)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }
        }
        else{
            System.out.println(Math.abs(X-D*K)<Math.abs(X+D*K)?Math.abs(X-D*K):Math.abs(X+D*K));
        }
    }
}