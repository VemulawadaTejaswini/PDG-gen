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
        
        int AokiMon=AokiMonHp/TakaMonPa; //高橋の攻撃をすべて受けて余った青木のHPの値
        int TakaMon=TakaMonHp/AokiMonPa; //青木の攻撃をすべて受けて余った高橋のHPの値
        
        if(AokiMon<=TakaMon)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}



