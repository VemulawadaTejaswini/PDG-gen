    import java.util.*;
     
    public class Main {
        public static void main(String[] args){
            // Your code here!
            Scanner sc = new Scanner(System.in);
            
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int length = M*2;
            
            int[] a = new int[length];
            
            for(int i = 0; i < length; i++){
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            
            int count = 0;
            
            for(int i = 1; i <= N; i++){
                for(int j = 0; j < length; j++){
                    if(i == a[j]){
                        count++;
                        break;
                    }
                }
            }
            int result = N - count;
            System.out.println(result);
            
        }
        
    }