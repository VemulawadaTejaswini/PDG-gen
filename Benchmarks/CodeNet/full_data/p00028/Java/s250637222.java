import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] list = new int[101];
                int max = 0;
                while(sc.hasNext()){
                        max = Math.max(max, ++list[sc.nextInt()]);
                }   
                sc.close();
                for(int i = 0; i < 101; i++){
                        if(list[i] == max){
                                System.out.println(i);
                        }   
                }   
        }   
}