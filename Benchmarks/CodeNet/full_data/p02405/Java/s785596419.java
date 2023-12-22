import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt(), w = sc.nextInt();
            
            if(h == 0 && w == 0)  break; 
            
            for (int i = 0; i < h; i++){
                
                if(i % 2 == 0){
                    for(int n = 0; n < w; n++){
                        if(n % 2 == 0){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }else{
                    for(int n = 0; n < w; n++){
                        if(n % 2 == 0){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
