import java.util.*;



public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //高橋のモンスター
        int TakaMonHp=sc.nextInt(); //体力
        int TakaMonPa=sc.nextInt(); //攻撃力
        
        //青木のモンスター
        int AokiMonHp=sc.nextInt(); //体力
        int AokiMonPa=sc.nextInt(); //攻撃力
        
        int AokiMon=AokiMonHp%TakaMonPa; //高橋モンスターの攻撃をすべて受けて余ったHPの値
        int TakaMon=TakaMonHp%AokiMonPa; //青木モンスターの攻撃をすべて受けて余ったHPの値
        
        if(AokiMon<TakaMon)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}



