import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int free = 0;
        int ans=0;
        int hai=0;
        int cha=0;
        int midori=0;
        int mizu=0;
        int ao=0;
        int ki=0;
        int dai=0;
        int aka=0;
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a<400){
                hai=1;
            }else if(a<800){
                cha=1;
            }else if(a<1200){
                midori=1;
            }else if(a<1600){
                mizu=1;
            }else if(a<2000){
                ao=1;
            }else if(a<2400){
                ki=1;
            }else if(a<2800){
                dai=1;
            }else if(a<3200){
                aka=1;
            }else{
                free++;
            }
        }
        
        ans= hai+cha+midori+mizu+ao+ki+dai+aka;
        
        if(ans==8 || free==0){
            System.out.println(ans +" "+ans);
        }else if(free>0){
            int c = ans+free;
            if(c>8){
                c=8;
            }
            System.out.println(ans +" "+c);
        }
   }
}
