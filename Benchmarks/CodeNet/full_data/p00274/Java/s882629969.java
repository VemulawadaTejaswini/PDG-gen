import java.util.Scanner;
   public class Main{
    public void so(){
        Scanner sc=new Scanner(System.in);
        int s = 0;
        int cnt = 1;
        int a = sc.nextInt();
         
        while(a != 0){
        for(int i=1; i<=a; i++){
            int sina = sc.nextInt();
             if(sina >= 2){
                 cnt ++;
            }else if(sina == 1){
                 s ++;
            }
        }
            if(cnt >= 2){
                System.out.println(cnt+s);
            }else{
                System.out.println("NA");
            }
              s = 0;
             cnt = 1;
             a = sc.nextInt();
        }
          }
        public static void main(String[]args){
        Main obj = new Main();
        obj.so();
    }
}