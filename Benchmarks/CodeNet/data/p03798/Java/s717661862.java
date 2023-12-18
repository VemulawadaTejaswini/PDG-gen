import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        String s = sc.next();
        solve(s);
    }
    static void solve(String s){
        int [] SW = new int [N];
        char in = s.charAt(0);
        SW[0] = 1; 
        SW[1] = 1;
        if(in=='o'){
            SW[N-1]=1; 
        }else{
            SW[N-1]=-1; 
        }
        function(SW,s);
        
        SW[1] = -1;
        if(in=='o'){
            SW[N-1]=-1;
        }else{
            SW[N-1]=1;
        }
        function(SW,s);
        
        SW[0] = -1; 
        SW[1] = 1;
        if(in=='o'){
            SW[N-1]=-1; 
        }else{
            SW[N-1]=1; 
        }
        function(SW,s);
        
        SW[1] = -1;
        if(in=='o'){
            SW[N-1]=1;
        }else{
            SW[N-1]=-1;
        }
        function(SW,s);
        System.out.println(-1);
        System.exit(0);
    }
    static void function(int[]SW, String s){
        for(int i=1; i<N-1; i++){
            char c = s.charAt(i);
            if(SW[i]==1){
                if(c=='o'){
                    SW[i+1]=SW[i-1];
                }else{
                    SW[i+1]=SW[i-1]*-1;
                }
            }else{
                if(c=='o'){
                    SW[i+1]=SW[i-1]*-1;
                }else{
                    SW[i+1]=SW[i-1];
                }
            }
        }
        char end = s.charAt(N-1);
        int z=-1;  if(end=='o')z=1;
        if( (SW[N-1]==1&&z==SW[0]*SW[N-2]) || (SW[N-1]==-1&&z!=SW[0]*SW[N-2]) ){
            print(SW);
        }
    }
    static void print(int[]A){
        for(int i=0; i<N; i++){
            if(A[i]==1){
                System.out.print("S");
            }else if(A[i]==-1){
                System.out.print("W");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        System.exit(0);
    }
}
