    import java.util.*;
        public class Main {
        static int threshold(int x,int y,int z){
            return x*x+y*y+z*z+x*y+x*z+y*z;
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int N= sc.nextInt();
            int f[]= new int[N];
            int sqN=(int)Math.sqrt(N);

            for(int n=1; n<N+1; n++) {
                for(int x=1; x<sqN+1; x++){
                    if(x*x>n){
                        break;
                    }
                    for(int y=1; y<sqN+1; y++){
                        if(x*x+y*y>n){
                            break;
                        }
            for(int z=1; z<sqN+1;z++){
                if(threshold(x,y,z)>n){
                    break;
                }else{
                    if(threshold(x,y,z)==n){
                        f[n-1]++;   
                    }
                }
            } 
                    }
                }
            }
              
            for(int i=0; i<N; i++){
                System.out.println(f[i]);
            }
        }
    }
