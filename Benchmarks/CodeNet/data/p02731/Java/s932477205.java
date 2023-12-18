import java.util.*;
class Main
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            
            int l = sc.nextInt();
            int sum = 0;
            
            for(int x=1 ; x<l ; x++){
                for(int y=1 ; y<l-x ; y++){
                    int z = l-(x+y);
                    int menseki = x*y*z;
                    if(menseki>sum){
                        sum=menseki;
                    }
                }
            }
            System.out.println(sum);
        }
}
