import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();

        int[] l = new int[100];
        
        if(A<B){
            for(int i=1;i<=A;i++){
                if((A%i==0)&&(B%i==0)){
                        l[i] = i;
                        
                    }
                }
            }
        if(B<A){
            for(int i=1;i<=B;i++){
                if((A%i==0)&&(B%i==0)){
                    l[i] = i;
                    
                }
            }
        }
        System.out.println(l[n]);
    }
}