import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static int[] arrays, mode;
        static int number;
        static int index = 1;
        public static void main(String[] args) {
                arrays = new int[101];
                mode = new int[101];
                for(int i = 0; i < arrays.length; i++)
                        arrays[i] = 0;
 
                while(read()){
 
                }
                solve();
        }
        static  boolean read(){
                int data;
                if(!sc.hasNext())
                        return false;
                data = sc.nextInt();
                arrays[data]++;
                return true;
        }
        static void solve(){
                int max = 0;
                for(int i = 1; i < arrays.length; i++){
                        max = Math.max(max, arrays[i]);
                }
                for(int i = 0; i < arrays.length; i++){
                        if(arrays[i] == max){
                                System.out.println(i);
                        }
                }
        }
}