import java.util.*;


class Main{

     public static void main(String []args){
        Scanner sc= new Scanner(System.ln);
        int x = sc.nextInt();
        int[] c = new int[x];
        int[] v = new int[x];
        int t = 0;
        for(int i = 0; i < x; i++){
            if( v[i] > c[i] ){
                t = t + v[i]-c[i];
            }
        }
        System.out.println(t);
        
        
     }
}