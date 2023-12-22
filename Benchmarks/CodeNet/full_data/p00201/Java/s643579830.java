import java.util.Scanner;
import java.util.ArrayList;
 

public class AOJ0201 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> item = new ArrayList<String>();
        ArrayList<Integer> itemMoney = new ArrayList<Integer>();
        ArrayList<String> alcmy = new ArrayList<String>();
        
        String ansStr,tmpStr1,tmpStr2;
        Integer oneItemMoney,alcmyItemMoney,alcmyFlg,ansInt;

        
        
        while(scan.hasNext())
        {
            oneItemMoney=0;
            alcmyItemMoney=0;
            alcmyFlg=1;
            ansInt=0;
            //アイテムセット
            int n = scan.nextInt();
            for(int i=0;i<n;i++)
            {
                item.add(scan.next());
                itemMoney.add(scan.nextInt());
            }
            //錬金レシピセット
            int m = scan.nextInt();
            for(int i=0;i<m;i++)
            {
                alcmy.add(scan.next());
                tmpStr1 = alcmy.get(i);
                //錬金するアイテムの値段を見る
                for(int j=0;j<n;j++)
                {
                    if(tmpStr1.equals(item.get(j)))
                    {
                        oneItemMoney=itemMoney.get(j);
                        break;
                    }
                }
                //錬金レシピの素材の値段を見る
                int k = scan.nextInt();
                alcmyItemMoney=0;
                for(int p=0;p<k;p++)
                {
                    tmpStr2 = scan.next();
                    for(int j=0;j<n;j++)
                    {
                        if(tmpStr2.equals(item.get(j)))
                        {
                            
                            alcmyItemMoney=alcmyItemMoney+itemMoney.get(j);
                            
                            break;
                        }
                    }
                    //System.out.println(alcmyItemMoney +"alc");
                    //System.out.println(oneItemMoney + "oneItem");
                    //そのアイテムの値段と錬金された時の値段を比較
                    /*if(oneItemMoney<alcmyItemMoney)
                    {
                        alcmyFlg=0;
                        break;
                    }*/
                }
                if(alcmyFlg==1)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(tmpStr1.equals(item.get(j)))
                        {
                            itemMoney.set(j,alcmyItemMoney);
                            break;
                       }
                    }  
                }
            
            }
            
            //指定されたアイテム
            ansStr = scan.next();
            for(int i=0;i<n;i++)
            {
                if(ansStr.equals(item.get(i)))
                {
                    ansInt=i;
                    break;
                }
            }
        
        
        
        

            //System.out.println(itemMoney.get(5));
            System.out.println(itemMoney.get(ansInt));

        } 
    }
}