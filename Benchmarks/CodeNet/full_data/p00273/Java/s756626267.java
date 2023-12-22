import java.util.Scanner;
public class Main{
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int nissu = sc.nextInt();
        
        for(int a=0; a<nissu; a++){
            int Nkin = sc.nextInt();
            int Pkin = sc.nextInt();
            int Nmai = sc.nextInt();
            int Pmai = sc.nextInt();
            int gokei=(Nkin*Nmai)+(Pkin*Pmai);
            
            if(Nmai>=5&&Pmai>=2){
                gokei = (Nkin*Nmai+Pkin*Pmai)*4/5;
            }else{
                if(Nmai<5){
                    Nmai = 5;
                }
                if(Pmai<2){
                    Pmai = 2;
                }
                int hiki = (Nkin*Nmai+Pkin*Pmai)*4/5;
                
                if(gokei>hiki){
                    gokei = hiki;
                }
            }
                System.out.println(gokei);
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}
                
                
            