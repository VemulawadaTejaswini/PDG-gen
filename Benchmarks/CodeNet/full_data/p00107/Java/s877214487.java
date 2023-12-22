import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] size = new int[3];
                for(int i = 0 ; i < 3 ; i++){
                        size[i] = sc.nextInt();
                }   
                while(size[0] != 0){ 
                        int n = sc.nextInt();
                        int minr2 = minr2(size);
                        for(int i = 0 ; i < n ; i++){
                                int r = 2*sc.nextInt();
                                if(r*r > minr2){
                                        System.out.println("OK");
                                }else{
                                        System.out.println("NA");
                                }   
                        }   
                        for(int i = 0 ; i < 3 ; i++){
                                size[i] = sc.nextInt();
                        }   
                }   
                sc.close();
        }   
        static int minr2(int[] size){
                Arrays.sort(size);
                return size[0]*size[0]+size[1]*size[1];
        }   
}