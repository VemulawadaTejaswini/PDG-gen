import java.util.Scanner;
public class Main{
    int a;//在庫  
    int b=1;//添え字（回数）
    int n;//種類
  
    public void solve(){
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
       
        while(n!=0){
         for(int i=0;i<n;i++){
             a = sc.nextInt();
             if(a>=2){
                 b+=1; 
             }
         }    
        if(b>=n){
          System.out.println(b);
        }else{
             System.out.println("NA"); 
        }  
        b=1;
       n = sc.nextInt();
      }         
  }
    
    public static void main(String[] args){
      Main obj=new Main();
        obj.solve();
    }
}