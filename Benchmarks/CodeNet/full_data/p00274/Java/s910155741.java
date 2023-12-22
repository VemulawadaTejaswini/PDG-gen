import java.util.Scanner;
   
public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
        int a = 0;
        int kaisu = 1;
        int n = sc.nextInt();
         
        while(n != 0){
        for(int i=1; i <= n; i++){
            int k = sc.nextInt();
             
            if(k >= 2){
                 kaisu ++;
            }else if(k == 1){
                 a ++;
            }
        }
             
            if(kaisu >= 2){
                System.out.println(kaisu+a);
            }else{
                System.out.println("NA");
            }
                 
             kaisu = 1;
             a = 0;
             n = sc.nextInt();
        }
         
       }
        public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}