import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int E = sc.nextInt();
            if(E==0)break;
            
            int ans = E;
            
            for(int z=0;z*z*z<=E;z++){
                int Cz = z*z*z;
                for(int y=0;y*y<=E-z*z*z;y++){
                    int Sy = y*y;
                    int x = E - Cz - Sy;
                    
                    if(ans>x+y+z){
                        ans = x+y+z;
                    }
                }
            }
            
            System.out.println(ans);
            
        }
        
    }
}