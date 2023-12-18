    import java.util.Scanner;
    class Main{
        public static void main(String arg[]){
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int m=scn.nextInt();
            int L=scn.nextInt();
            int R=scn.nextInt();
            for(int i=0;i<2*(m-1);i++){
                int buf=scn.nextInt();
                if(i%2==0){
                    if(L<buf){
                        L = buf;
                    }
                }else if(i%2==1){
                    if(buf<R){
                        R=buf;
                    }
                }
            }    
                
             if(R-L+1>n){
                System.out.println(n);
            }else{
                System.out.println(R-L+1);
            }
        }
    }