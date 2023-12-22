import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int hi,x,y,b,p,wkei;
        
        hi=sc.nextInt(); 
     
          for(int i=1;i<=hi;i--){
          x=sc.nextInt();
          y=sc.nextInt();
          b=sc.nextInt();
          p=sc.nextInt();
        if(b>=5&&p>=2){
            wkei=(x*b+y*p)/10*8;
            System.out.println(wkei);
        }else{
            System.out.println(x*b+y*p);
        }
          }
      
    }
 
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}