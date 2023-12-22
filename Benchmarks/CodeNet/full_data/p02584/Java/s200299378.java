import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long X=sc.nextLong(),K=sc.nextLong(),D=sc.nextLong(),end=0,endl=0;
        if(K>X/D){
            if(Math.abs(X-(X/D)*D)<Math.abs(X-((X/D)+1)*D)){
                end=Math.abs(X-(X/D)*D);
                endl=Math.abs(X-((X/D)+1)*D);
                if((K-X/D)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }else{
                endl=Math.abs(X-(X/D)*D);
                end=Math.abs(X-((X/D)+1)*D);
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
